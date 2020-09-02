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
    }
}