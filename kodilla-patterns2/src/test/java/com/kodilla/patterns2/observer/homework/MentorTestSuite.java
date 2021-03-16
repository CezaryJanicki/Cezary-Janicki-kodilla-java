package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {

    @Test
    public void testUpdateOneTaskList() {
        //Given
        TaskList taskListMirekJanik = new TaskList("taskListMirekJanik");
        TaskList taskListMarekZbyszek = new TaskList("taskListMarekZbyszek");
        Mentor johnCollins = new Mentor("johnCollins");
        Mentor marekMichalak = new Mentor("marekMichalak");
        taskListMirekJanik.registerMentor(johnCollins);
        taskListMarekZbyszek.registerMentor(marekMichalak);
        taskListMarekZbyszek.registerMentor(johnCollins);
        //When
        taskListMirekJanik.addTask("Definition of variables - create new variables");
        taskListMirekJanik.addTask("Difference between int and Integer");
        taskListMarekZbyszek.addTask("What are arrays");
        taskListMarekZbyszek.addTask("Can arrays be unbound");
        taskListMarekZbyszek.addTask("Arrays exam");
        //Then
        assertEquals(5, johnCollins.getUpdateCount());
        assertEquals(3, marekMichalak.getUpdateCount());
    }
}
