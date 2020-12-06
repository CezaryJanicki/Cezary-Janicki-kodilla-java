package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TaskList taskListOne = new TaskListOne();
        TaskList taskListTwo = new TaskListTwo();
        Mentor johnCollins = new JohnCollinsMentor();
        Mentor marekMichalak = new MarekMichalakMentor();
        taskListOne.registerMentor(johnCollins);
        taskListTwo.registerMentor(marekMichalak);
        taskListTwo.registerMentor(johnCollins);
        //When
        taskListOne.addTask("Definition of variables - create new variables");
        taskListOne.addTask("Difference between int and Integer");
        taskListTwo.addTask("What are arrays");
        taskListTwo.addTask("Can arrays be unbound");
        taskListTwo.addTask("Arrays exam");
        //Then
        assertEquals(5, johnCollins.getUpdateCount());
        assertEquals(3, marekMichalak.getUpdateCount());
    }
}
