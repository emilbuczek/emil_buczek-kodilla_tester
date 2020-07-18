package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel(60);
        doRace(opel);

        Mercedes mercedes = new Mercedes(80);
        doRace(mercedes);

        Audi audi = new Audi(90);
        doRace(audi);
    }
    public static void doRace(Car car){
        System.out.println(car.getSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
    }
}
