package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PortfolioTestSuite {

    @Test
    public void testTaskAddToDoList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        List<String> task = board.toDoList.addTask("Done task 1");
        //Then
        Assert.assertEquals(board.toDoList.addTask("Done task 1"), board.toDoList.getTaskList());
        System.out.println(board.toDoList.getTaskList());
        System.out.println(task);
    }

    @Test
    public void testTaskAddInProgressList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        List<String> task = board.inProgressList.addTask("Done task 1");
        //Then
        Assert.assertTrue(board.inProgressList.getTaskList().contains("Done task 1"));
        System.out.println(task);

    }

    @Test
    public void testTaskAddDoneList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        List<String> taskDoneList1 = board.doneList.addTask("Done task 1");
        List<String> taskDoneList2 = board.doneList.addTask("Done task 2");
        //Then
        Assert.assertTrue(board.doneList.getTaskList().contains("Done task 1"));
        Assert.assertTrue(board.doneList.getTaskList().contains("Done task 2"));
        System.out.println(taskDoneList1);
        System.out.println(taskDoneList2);
    }

    @Test
    public void testTaskAddAllLists() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        List<String> taskToDoList = board.toDoList.addTask("To do task 1");
        List<String> taskInProgresList = board.inProgressList.addTask("In Progress Task 1");
        List<String> taskDoneList = board.doneList.addTask("Done Task 1");
        //Then
        System.out.println(board.toDoList.getTaskList());
        System.out.println(board.inProgressList.getTaskList());
        System.out.println(board.doneList.getTaskList());
    }

    @Test
    public void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When & Then
        System.out.println("XXXXXXXXXXXXXXXXXXXXX Beans list XXXXXXXXXXXXXXXXXX");
        Arrays.stream(context
                .getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("XXXXXXXXXXXXXXXXXXXXX Beans list XXXXXXXXXXXXXXXXXX");
    }
}
