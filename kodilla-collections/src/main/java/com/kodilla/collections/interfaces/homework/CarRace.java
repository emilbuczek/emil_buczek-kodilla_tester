package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel(80);
        doRace(opel);

        Mercedes mercedes = new Mercedes(95);
        doRace(mercedes);

        Audi audi = new Audi(89);
        doRace(audi);
    }
    public static void doRace(Car car){
        System.out.println(car.getSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
    }
}
