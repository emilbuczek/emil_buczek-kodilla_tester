package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-----------------");
        System.out.println("Car speed " + " " + car.getSpeed());
        System.out.println("Car increase speed " + " " + car.increaseSpeed());
        System.out.println("Car decrease speed " + " " +car.decreaseSpeed());
        System.out.println("Car Mark name's " + " " + getMarkName(car));
    }
    private static String getMarkName(Car car){
        if (car instanceof Audi)
            return "Audi";
            else if(car instanceof Mercedes)
                return "Mercedes";
             else if(car instanceof Opel)
                return "Opel";
             else return "unknown car mark";
    }
}
