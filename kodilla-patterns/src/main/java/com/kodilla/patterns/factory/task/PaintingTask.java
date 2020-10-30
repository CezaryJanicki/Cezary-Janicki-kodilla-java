package com.kodilla.patterns.factory.task;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecuted = false;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        if (!isExecuted) {
            this.isExecuted = true;
            return "I am " + taskName + " " + color + " " + whatToPaint;
        }
        return "Task not executed";
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
