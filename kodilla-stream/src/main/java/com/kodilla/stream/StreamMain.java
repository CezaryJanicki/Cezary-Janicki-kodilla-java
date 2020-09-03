package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forumStream = new Forum();

        Map<Integer, ForumUser> usersByIndividualNumber = forumStream.getUserList().stream()
                .filter(ForumUser -> ForumUser.getGender() == 'M')
                .filter(ForumUser -> ForumUser.getYear() <= LocalDate.now().minusYears(20).getYear())
                .filter(ForumUser -> ForumUser.getNoOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserIndividualNumber, Function.identity()));

        System.out.println("Number of elements in the original forumStream equals: " + forumStream.getUserList().size());
        System.out.println("Number of elements in the map equals: " + usersByIndividualNumber.size());
        usersByIndividualNumber.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);

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