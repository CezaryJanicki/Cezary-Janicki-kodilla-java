package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Observable {

    private final List<Mentor> observers;
    private final List<String> tasks;
    private final String name;

    public TaskList(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyMentors();
    }

    @Override
    public void registerMentor(Mentor mentor) {
        observers.add(mentor);
    }

    @Override
    public void notifyMentors() {
        for (Mentor mentor : observers) {
            mentor.update(this);
        }
    }

    @Override
    public void removeMentor(Mentor mentor) {
        observers.remove(mentor);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
