package com.kodilla.testing.book;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookLibraryTest {

    private static int counter = 0;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test suite started");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite ended");
    }
    @Before
    public void beforeTest(){
        counter++;
        System.out.println("Test number "+counter);
    }

    @Test
    public void testListBooksInHandsOff_noBooksRented(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        when(libraryDatabase.listBooksInHandsOf(any(LibraryUser.class)))
                .thenReturn(Arrays.asList());
        LibraryUser libraryUser = new LibraryUser("firstName","SecondName","23232323");
        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        Assert.assertEquals(0,result.size());
    }

    @Test
    public void testListBooksInHandsOff_oneBookRented(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        Book book = new Book("TestTitle","TestAuthor",2019);
        when(libraryDatabase.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(
                Arrays.asList(book));
        LibraryUser libraryUser = new LibraryUser("firstName","SecondName","23232323");
        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        Assert.assertEquals(1,result.size());
    }
    @Test
    public void testListBooksInHandsOff_fiveBooksRented(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> fiveBooks = generateListOfNBooks(5);
        when(libraryDatabase.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(
                fiveBooks);
        LibraryUser libraryUser = new LibraryUser("firstName","SecondName","23232323");
        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        Assert.assertEquals(5,result.size());
    }

}