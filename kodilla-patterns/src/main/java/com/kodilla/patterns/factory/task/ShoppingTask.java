package com.kodilla.patterns.factory.task;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private Boolean isExecuted = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        if (!isExecuted) {
            this.isExecuted = true;
            return "I am " + taskName + " for " + quantity + " " + whatToBuy;
        }
        return "Task is not executed";
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isExecuted) {
            return true;
        }
        return false;
    }
}
