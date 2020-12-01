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
    private final static String DESCRIPTION = "Tasks in Progress";
    private final static String LIST_NAME = "In progress";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);
        taskListDao.save(taskList);
        //When
        List<TaskList> readListName = taskListDao.findByListName(LIST_NAME);
        String taskListName = taskList.getListName();
        //Then
        Assert.assertEquals(LIST_NAME, taskListName);
        Assert.assertEquals(1, readListName.size());
        //CleanUp
        taskListDao.delete(taskList);
    }
}
