package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalBeautifier;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String poem = " Tiger, tiger, burning bright \n in the forests of the night \n what immortal head or eye \n could frame thy fearful symmetry?";

        poemBeautifier.beautify(poem, a -> a.toUpperCase());
        poemBeautifier.beautify(poem, a -> "ABC " + a + " DEF");
        poemBeautifier.beautify(poem, a -> a.toLowerCase());
        poemBeautifier.beautify(poem, a -> {
            String newText = "";
            for (int i = 0; i < a.length(); i++) {
                newText = newText  + "  " + a.charAt(i);
            } return newText;
        });

        poemBeautifier.beautify(poem, String::toUpperCase);
        poemBeautifier.beautify(poem, FunctionalBeautifier::beautifyBeginningAndAnd);
        poemBeautifier.beautify(poem, String::toUpperCase);
        poemBeautifier.beautify(poem, FunctionalBeautifier::beautifyDoubleSpace);

        System.out.println("Original version \n" + poem);
    }
}