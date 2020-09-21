package com.kodilla.exception.nullpointer;

import com.sun.xml.internal.ws.api.message.Message;

public class MessageSender {
    public void sendMessageTo(User user, String message) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        } else {
            throw new MessageNotSentException("Object user was null");
        }
    }
}