package com.kodilla.inheritance.homework;
import com.kodilla.inheritance.homework.OperatingSystem;

public class ShowYourself {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2015, 4) {
            @Override
            public void turnOn() {
                super.turnOn();
            }
            @Override
            public void turnOff() {
            super.turnOff();
            }
        };
        StartApplications startApplications = new StartApplications(2015,4);
        startApplications.startApplications();
        System.out.println("System is downloading" + " " + "and starting applications" + " "+ startApplications.getNumberOfApplications() + " " + "year of Operating system is" + " " + operatingSystem.getProductionYear());

        EndApplications endApplications = new EndApplications(2015, 4);
        endApplications.endApplications();
        System.out.println("System is closing down" + " " + "and saving progress on applications" + " " + endApplications.getNumberOfApplications() + " " + "year of Operating system is" + " " + operatingSystem.getProductionYear());
        }
}