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
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminatorTest = new OddNumbersExterminator();
        //When
        List<Integer> expectedList = oddNumbersExterminatorTest.exterminate(numbers);
        //Then
        Assert.assertTrue(expectedList.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorFullList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        OddNumbersExterminator oddNumbersExterminatorTest = new OddNumbersExterminator();
        ArrayList<Integer> evenList = new ArrayList<>();
        evenList.add(2);
        evenList.add(4);
        //When
        List<Integer> expectedList = oddNumbersExterminatorTest.exterminate(numbers);
        //Then
        Assert.assertEquals(evenList, expectedList);
    }
}
