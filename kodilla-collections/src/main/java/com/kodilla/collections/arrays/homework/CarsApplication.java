package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Opel;
import java.util.Random;



public class CarsApplication {
    public static void main(String[] args){
        Car[]cars = new Car[15];
        for(int n=0;n< cars.length;n++)
            cars[n]= drawCar();
        for(Car car:cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
        int makeNewCar = random.nextInt(15);
        int a = random.nextInt() * 1 + 1;
        int b = random.nextInt() * 2 + 1;
        int c = random.nextInt() * 3 + 1;
        if (makeNewCar == 1)
            return new Audi(a);
        else if (makeNewCar == 2)
            return new Mercedes(b);
        else
            return new Opel(c);

    }
}
