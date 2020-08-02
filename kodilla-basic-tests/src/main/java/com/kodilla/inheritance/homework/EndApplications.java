package com.kodilla.inheritance.homework;

public class EndApplications extends OperatingSystem {
    public EndApplications(int productionYear, int numberOfApplications) {
        super(productionYear, numberOfApplications);
    }
    public void endApplications() {
        System.out.println("Saving progress and closing down all applications ..");
    }
    @Override
    public void turnOff() {
        System.out.println("Closing all applications");
    }
}