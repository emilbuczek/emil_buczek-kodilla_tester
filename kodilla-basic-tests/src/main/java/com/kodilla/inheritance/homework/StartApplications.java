package com.kodilla.inheritance.homework;

public class StartApplications extends OperatingSystem {
    public StartApplications(int productionYear, int numberOfApplications) {
        super(productionYear, numberOfApplications);
    }
    public void startApplications(){
        System.out.println("Open favourite applications");
    }
    @Override
    public void turnOn() {
        System.out.println("System up and opening Favourite Applications");
    }
}
