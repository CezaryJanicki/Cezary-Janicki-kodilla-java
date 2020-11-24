package com.koilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.task.*;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.createTask(TaskFactory.TaskType.DRIVING);
        boolean before = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        String drivingTaskName = drivingTask.getTaskName();
        boolean after = drivingTask.isTaskExecuted();
        //Then
        Assert.assertFalse(before);
        Assert.assertEquals("Drive Home", drivingTaskName);
        Assert.assertTrue(after);
        Assert.assertTrue(drivingTask instanceof DrivingTask);
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.createTask((TaskFactory.TaskType.PAINTING));
        boolean before = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        String painingTaskName = paintingTask.getTaskName();
        boolean after = paintingTask.isTaskExecuted();
        //Then
        Assert.assertFalse(before);
        Assert.assertEquals("painting at Home", painingTaskName);
        Assert.assertTrue(after);
        Assert.assertTrue(paintingTask instanceof PaintingTask);
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.createTask((TaskFactory.TaskType.SHOPPING));
        boolean before = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        String painingTaskName = shoppingTask.getTaskName();
        boolean after = shoppingTask.isTaskExecuted();
        //Then
        Assert.assertFalse(before);
        Assert.assertEquals("shopping in H&M", painingTaskName);
        Assert.assertTrue(after);
        Assert.assertTrue(shoppingTask instanceof ShoppingTask);
    }
}
