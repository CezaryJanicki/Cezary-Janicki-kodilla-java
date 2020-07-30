package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator();
        System.out.println("Test - pierwszy test jednostkowy: dodawanie.");
        int addResult = calculator.add(3,2);

        if (addResult == 5) {
            System.out.println("Test ok!");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - drugi test jednostkowy: odejmowanie.");
        int subtractResult = calculator.subtract(3, 2);

        if (subtractResult == 1) {
            System.out.println("Test ok!");
        } else {
            System.out.println("Error!");
        }
    }
}
