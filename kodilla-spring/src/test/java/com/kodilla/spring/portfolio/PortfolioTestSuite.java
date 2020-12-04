package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.config.Task;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PortfolioTestSuite {
    @Test
    public void testBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList getToDoList = context.getBean("toDoList", TaskList.class);
        getToDoList.addTask("Task1");
        TaskList inProgressList = context.getBean("inProgressList", TaskList.class);
        inProgressList.addTask("Task2");
        TaskList doneList = context.getBean("doneList", TaskList.class);
        doneList.addTask("Task3");
        //When
        //Then
        Assert.assertEquals( 1, board.getGetToDoList().getTaskList().size());
        Assert.assertTrue(board.getGetToDoList().getTaskList().contains("Task1"));
        Assert.assertEquals(1, board.getInProgressList().getTaskList().size());
        Assert.assertTrue(board.getInProgressList().getTaskList().contains("Task2"));
        Assert.assertEquals(1, board.getDoneList().getTaskList().size());
        Assert.assertTrue(board.getDoneList().getTaskList().contains("Task3"));
    }
}
