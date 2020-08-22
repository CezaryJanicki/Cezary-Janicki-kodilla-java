package com.kodilla.stream.reference;

public class FunctionalBeautifier {
    public static String beautifyToUpperCase(String text) {
        return text.toUpperCase();
    }
    public static String beautifyBeginningAndAnd(String text) {
        return "ABC " + text + " DEF";
    }
    public static String beautifyToLowerCase(String text) {
        return text.toLowerCase();
    }
    public static String beautifyDoubleSpace(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            newText = newText + "  " + text.charAt(i);
        } return newText;
    }
}
