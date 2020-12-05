package com.kodilla.hibernate.manytomany.facade;

public class NotFoundException extends Exception {
    public static String COMPANY_NOT_FOUND = "No such company exists. Try another String";
    public static String EMPLOYEE_NOT_FOUND = "No such employee exists. Try another String";
    public static String WRONG_CHARACTERS = "Wrong characters. Please use only Strings";

    public NotFoundException(String message) { super(message); }
}
