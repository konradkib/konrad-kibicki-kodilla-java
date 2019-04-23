package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    ShapeCollector shapeCollector = new ShapeCollector();

    @Test
    public void testAddFigure(){
        //Given
        Square square = new Square("Square",6);
        Circle circle0 = new Circle("Circle",6);
        Triangle triangle0 = new Triangle("Triangle",6,5.5);
        Circle circle1 = new Circle("Circle",10);
        Triangle triangle1 = new Triangle("Triangle",2.5, 2);
        Circle circle2 = new Circle("Circle",20);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle0);
        shapeCollector.addFigure(triangle0);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(circle2);
        //Then
        Assert.assertEquals(6,shapeCollector.getFigureList().size());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Triangle triangle = new Triangle("Triangle",12,0.5);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(0,shapeCollector.getFigureList().size());
    }

    @Test
    public void testGetFigure(){
        //Given
        Circle circle2 = new Circle("Circle",12);
        //When
        shapeCollector.addFigure(circle2);
        Shape retrievedShape  = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle2, retrievedShape);
    }

    @Test
    public void testShowFigures(){
        //Given
        Square square = new Square("Square",6);


        //When
        shapeCollector.addFigure(square);
        String result = square.getShapeName();

        //Then
        Assert.assertNotEquals("Circle",result);

    }
}
