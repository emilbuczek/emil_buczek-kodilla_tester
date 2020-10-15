package com.kodilla.spring.basic.spring_dependency_injection;

public class FacebookMessageService implements MessageService {

    @Override
    public String send(String message, String receiver) {
        System.out.println("Sending [" + message + "] to: " + receiver + " using Facebook");
        return message;
    }
}