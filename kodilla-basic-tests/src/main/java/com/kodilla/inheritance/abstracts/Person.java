package com.kodilla.inheritance.abstracts;

public class Person {
    public String firstName;
    public int age;
    public Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getJob() {
        return this.job.getNameOfResponsibilities();
    }
}
