package com.kodilla.inheritance.abstracts;

public class Programmer extends Job{
    public Programmer(String nameOfResponsibilities, int numberOfSalary) {
        super(nameOfResponsibilities, numberOfSalary);
    }

    @Override
    public String getJob() {
        return getNameOfResponsibilities();
    }
}
