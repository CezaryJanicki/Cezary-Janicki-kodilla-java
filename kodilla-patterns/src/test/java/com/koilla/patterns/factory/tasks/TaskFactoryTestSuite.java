package com.koilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.task.Task;
import com.kodilla.patterns.factory.task.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.createTask(TaskFactory.DrivingTask);
        String drivingTaskExecution = drivingTask.executeTask();
        String drivingTaskName = drivingTask.getTaskName();
        Boolean drivingTaskExecutionConfirmation = drivingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("I Drive Home to Poznan by Car", drivingTaskExecution);
        Assert.assertEquals("Drive Home", drivingTaskName);
        Assert.assertTrue(drivingTaskExecutionConfirmation);
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.createTask((TaskFactory.PaintingTask));
        String paintingTaskExecution = paintingTask.executeTask();
        String painingTaskName = paintingTask.getTaskName();
        Boolean painingTaskExecutionConfirmation = paintingTask.isTaskExecuted();
        //THen
        Assert.assertEquals("I am painting at Home Blue Roses", paintingTaskExecution);
        Assert.assertEquals("painting at Home", painingTaskName);
        Assert.assertTrue(painingTaskExecutionConfirmation);
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.createTask((TaskFactory.ShoppingTask));
        String paintingTaskExecution = shoppingTask.executeTask();
        String painingTaskName = shoppingTask.getTaskName();
        Boolean painingTaskExecutionConfirmation = shoppingTask.isTaskExecuted();
        //THen
        Assert.assertEquals("I am shopping in H&M for 13.0 Trousers", paintingTaskExecution);
        Assert.assertEquals("shopping in H&M", painingTaskName);
        Assert.assertTrue(painingTaskExecutionConfirmation);
    }
}
