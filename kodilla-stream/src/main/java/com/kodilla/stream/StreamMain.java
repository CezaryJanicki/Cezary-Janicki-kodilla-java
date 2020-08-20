package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.sql.SQLOutput;

public class StreamMain {
    public static void main(String[] args) {

        //solution 1 - OOP
        //SaySomething saySomething = new SaySomething();
        //saySomething.say();

        //solution 2 - interface
        Processor processor = new Processor();
        //ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //processor.execute(executeSaySomething);

        //solution 3 - function
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        //processor.execute(codeToExecute);
        //solution 3a - shorter version
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        //by referencing methods
        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String poem = " Tiger, tiger, burning bright \n in the forests of the night \n what immortal had or eye \n oule frame thy fearful symmetry?";

        poemBeautifier.beautify(poem, (a) -> a.toUpperCase());
        poemBeautifier.beautify(poem, (a) -> "ABC " + a + " DEF");
        poemBeautifier.beautify(poem, (a) -> a.toLowerCase());
        poemBeautifier.beautify(poem, (a) -> {
            String newText = "";
            for (int i = 0; i < a.length(); i++) {
                newText = newText  + "\n" + a.charAt(i);
            } return newText;
        });

        System.out.println("Original version \n" + poem);
    }
}