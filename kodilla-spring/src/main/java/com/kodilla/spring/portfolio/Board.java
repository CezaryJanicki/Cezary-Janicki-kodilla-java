package com.kodilla.spring.portfolio;

public class Board {
    private final TaskList getToDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList getToDoList, TaskList inProgressList, TaskList doneList) {
        this.getToDoList = getToDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getGetToDoList() {
        return getToDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }


}
