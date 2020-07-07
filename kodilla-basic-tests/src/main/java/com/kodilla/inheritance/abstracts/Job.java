package com.kodilla.inheritance.abstracts;

public  abstract class Job {
    private String nameOfResponsibilities;
    private int numberOfSalary;


    public Job(String nameOfResponsibilities, int numberOfSalary) {
        this.numberOfSalary = numberOfSalary;
        this.nameOfResponsibilities = nameOfResponsibilities;
    }

    public int getNumberOfSalary() {
        return numberOfSalary;
    }

    public String getNameOfResponsibilities() {
        return nameOfResponsibilities;
    }

    public abstract void getJob();
}
