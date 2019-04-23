package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.*;

import java.util.*;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Starts");
    }
    @After
    public void after(){
        System.out.println("Test Ends");
    }

    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(15);
        input.add(2);
        input.add(3);
        input.add(4);
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(input);
        //Then
        Assert.assertEquals(2, result.size());
        for (Integer i : result) {
            Assert.assertEquals(0, i % 2);
        }
        for (Integer i : result) {
            Assert.assertNotEquals(1, i % 2);
        }


    }

        @Test
    public void testOddNumbersExterminatorEmptyList(){
            //Given
            ArrayList<Integer> input = new ArrayList<>();
            //When
            ArrayList<Integer> result = oddNumbersExterminator.exterminate(input);
            //Then
            Assert.assertEquals(0, result.size());
        }


}