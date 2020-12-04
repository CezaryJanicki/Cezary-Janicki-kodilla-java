package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class BoardConfig {

    @Bean
    public Board Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean
    public TaskList toDoList() {
        return new TaskList();
    }
    @Bean
    public TaskList inProgressList() {
        return new TaskList();
    }
    @Bean
    public TaskList doneList() {
        return new TaskList();
    }
}
