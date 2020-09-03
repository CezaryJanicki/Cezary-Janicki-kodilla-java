package com.kodilla.stream.reference;

public class FunctionalBeautifier {
    public static String beautifyBeginningAndAnd(String text) {
        return "ABC " + text + " DEF";
    }
    public static String beautifyDoubleSpace(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            newText = newText + "  " + text.charAt(i);
        } return newText;
    }
}
