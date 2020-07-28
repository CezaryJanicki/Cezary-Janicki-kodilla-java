package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.lang.*;
import java.util.List;

public class OddNumbersExterminator {

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    public ArrayList<Integer> exterminate(List<Integer> numbers) {
        ArrayList<Integer> oddNumbersList = new ArrayList<Integer>();
        for (Integer number: numbers) {
            if (number % 2 == 0) {
                oddNumbersList.add(number);
            }
        }
        return oddNumbersList;
    }
}