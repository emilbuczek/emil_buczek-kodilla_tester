package com.kodilla.inheritance.homework;

public class Backup extends OperatingSystem {

    public Backup(int productionYear, int numberOfApplications) {
        super(productionYear, numberOfApplications);
    }

    public void makeBackup() {
        System.out.println("Saving progress ..");
    }


    @Override
    public void turnOff() {
        System.out.println("System is saving your progress before shutting down");
    }
}
