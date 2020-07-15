package com.kodilla.testing.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(1, 2);
        System.out.println(addResult);
        int subractResult = calculator.subtract(3, 2);
        System.out.println(subractResult);
    }
}
