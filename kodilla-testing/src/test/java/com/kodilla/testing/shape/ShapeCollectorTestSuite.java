package com.kodilla.testing.shape;

import org.junit.*;

//Test suite for classes of Forum
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

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeList = new ShapeCollector();
        Shape addedFigure = new Circle (2);
        //When
        shapeList.addFigure(addedFigure);
        //Then
        Assert.assertEquals(1, shapeList.size());
        Assert.assertEquals(addedFigure, shapeList.getFigure(0));
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3);
        Shape square = new Square(3);
        Shape triangle = new Triangle(2,2);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        //Expect
        Assert.assertEquals(triangle, shapeCollector.getFigure(2));
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector shapeList = new ShapeCollector();
        Shape triangleB2H2 = new Triangle(2,2);
        Shape triangleB1H1 = new Triangle (1,1);
        shapeList.addFigure(triangleB2H2);
        //When
        boolean result = shapeList.removeFigure(triangleB1H1);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeList = new ShapeCollector();
        Shape triangle = new Triangle(2,2);
        shapeList.addFigure(triangle);
        //When
        boolean result = shapeList.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeList.size());
    }

    @Test
    public void testRemoveFigureTwoFigures() {
        //Given
        ShapeCollector shapeList = new ShapeCollector();
        Shape triangle = new Triangle(2,2);
        Shape circle = new Circle(2);
        shapeList.addFigure(triangle);
        shapeList.addFigure(circle);
        //When
        boolean result = shapeList.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(1, shapeList.size());
        Assert.assertEquals(circle, shapeList.getFigure(0));
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeList = new ShapeCollector();
        Shape triangle = new Triangle(2,2);
        shapeList.addFigure(triangle);
        shapeList.addFigure(triangle);
        shapeList.addFigure(triangle);
        //When
        shapeList.showFigures();
    }
}
