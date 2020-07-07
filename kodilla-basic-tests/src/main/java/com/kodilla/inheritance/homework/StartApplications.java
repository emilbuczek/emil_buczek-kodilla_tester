package com.kodilla.inheritance.homework;

public class StartApplications extends OperatingSystem {

    public StartApplications(int productionYear, int numberOfApplications) {
        super(productionYear, numberOfApplications);
    }

    public void startApplications() {
        System.out.println("Opening Favourite Applications");
    }


    @Override
    public void turnOn() {
        System.out.println("Opening System and Applications");
    }
}
