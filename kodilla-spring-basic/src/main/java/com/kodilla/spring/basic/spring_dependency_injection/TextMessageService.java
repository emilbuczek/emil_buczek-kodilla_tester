package com.kodilla.spring.basic.spring_dependency_injection;

public class TextMessageService implements MessageService {
    @Override
    public String send(String message, String receiver) {
        System.out.println("Sending text [" + message + "] to: " + receiver);
        return message;
    }
}