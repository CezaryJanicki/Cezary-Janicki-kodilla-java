package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;
    private final static String Description = "Tasks in Progress";
    private final static String ListName = "In progress";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(ListName, Description);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        System.out.println(listName);
        //When
        List<TaskList> readListName = taskListDao.findByListName(listName);
        //Then
        //Assert.assertEquals(listName, readListName);
        Assert.assertEquals(1, readListName.size());
        //CleanUp
        taskListDao.delete(taskList);
    }
}
