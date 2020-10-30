package com.kodilla.patterns.factory.task;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isExecuted = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        if (!isExecuted) {
            this.isExecuted = true;
            return "I " + taskName + " to " + where + " by " + using;
        }
        return "Task not Executed";
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
