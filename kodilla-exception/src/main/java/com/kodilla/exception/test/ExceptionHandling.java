package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(3.0, 3.0);
        } catch (Exception e) {
            System.out.println("I have found the exception " + e + " and handled it!");
        } finally {
            System.out.println("Thank you. Goodbye.");
        }
    }
}
