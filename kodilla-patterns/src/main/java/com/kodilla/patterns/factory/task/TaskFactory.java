package com.kodilla.patterns.factory.task;

public class TaskFactory {
    public enum TaskType {DRIVING, PAINTING, SHOPPING}

    public final Task createTask(final TaskType taskClass) {
        switch(taskClass) {
            case DRIVING:
                return new DrivingTask("Drive Home", "Poznan", "Car");
            case PAINTING:
                return new PaintingTask("painting at Home", "Blue", "Roses");
            case SHOPPING:
                return new ShoppingTask("shopping in H&M", "Trousers", 13.00);
            default:
                throw new IllegalArgumentException();
        }
    }
}
