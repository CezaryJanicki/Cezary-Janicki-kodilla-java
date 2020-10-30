package com.kodilla.patterns.factory.task;

public class TaskFactory {
    public static final String DrivingTask = "DrivingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String ShoppingTask = "ShoppingTask";

    public final Task createTask(final String taskClass) {
        switch(taskClass) {
            case DrivingTask:
                return new DrivingTask("Drive Home", "Poznan", "Car");
            case PaintingTask:
                return new PaintingTask("painting at Home", "Blue", "Roses");
            case ShoppingTask:
                return new ShoppingTask("shopping in H&M", "Trousers", 13.00);
            default:
                return null;
        }
    }
}
