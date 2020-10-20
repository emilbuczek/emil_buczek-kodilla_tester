package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem{


    public Windows(int productionYear, int numberOfApplications) {
        super(productionYear, numberOfApplications);
    }

    public void printName(){
        System.out.println("this is windows");
    }
}
