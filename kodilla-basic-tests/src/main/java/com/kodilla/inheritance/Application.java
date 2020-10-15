package com.kodilla.inheritance;

public class Application {

    public static void main(String[] args) {
        com.kodilla.inheritance.Car car = new com.kodilla.inheritance.Car(4, 5);
        car.turnOnLights();

        Convertible convertible = new Convertible(4, 2);
        convertible.turnOnLights();
        System.out.println(convertible.getSeats());
    }
}