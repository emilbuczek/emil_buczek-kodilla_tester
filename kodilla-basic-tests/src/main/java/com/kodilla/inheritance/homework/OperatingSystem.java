package com.kodilla.inheritance.homework;

public abstract class OperatingSystem {
    private int productionYear;
    private int numberOfApplications;

    public OperatingSystem(int productionYear, int numberOfApplications) {
        this.productionYear = productionYear;
        this.numberOfApplications = numberOfApplications;
    }
    public void turnOn() {
        System.out.println("System Up..");
    }
    public void turnOff() {
        System.out.println("System is closing down ..");
    }
    public int getProductionYear() {
        return productionYear;
    }
    public int getNumberOfApplications(){
        return numberOfApplications;
    }
}
