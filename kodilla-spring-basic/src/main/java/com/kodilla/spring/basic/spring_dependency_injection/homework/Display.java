package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public String display(double value) {
        System.out.println(value);
        return null;
    }
}