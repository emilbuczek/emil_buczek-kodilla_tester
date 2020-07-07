package com.kodilla.inheritance.homework;

public class ShowYourself {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2015, 4);
        operatingSystem.turnOn();

        StartApplications startApplications = new StartApplications(2015 , 4);
        startApplications.getProductionYear();
        System.out.println(startApplications.getProductionYear());
    }
}