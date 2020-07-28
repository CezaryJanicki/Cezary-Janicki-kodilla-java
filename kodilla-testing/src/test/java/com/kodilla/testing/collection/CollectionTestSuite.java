package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("SUT Unit test commencing.");
    }

    @After
    public void after() {
        System.out.println("SUT Unit test completed.");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("SUT Class Suit test commencing.");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("SUT Class Suit test completed");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminatorTest = new OddNumbersExterminator();
        //When
        List<Integer> testedList = oddNumbersExterminatorTest.exterminate(testList);
        //Then
        Assert.assertTrue(testedList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorFullList() {
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        OddNumbersExterminator oddNumbersExterminatorTest = new OddNumbersExterminator();
        ArrayList<Integer> evenList = new ArrayList<>();
        evenList.add(2);
        evenList.add(4);
        //When
        List<Integer> testedList = oddNumbersExterminatorTest.exterminate(testList);
        //Then
        Assert.assertEquals(evenList, testedList);
    }
}
