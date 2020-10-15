package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Opel;
import java.util.Random;



public class CarsApplication {
    public static void main(String[] args){
        Random random = new Random();
        Car[]cars = new Car[random.nextInt(15)+1];
        for(int n=0;n< cars.length;n++)
            cars[n]= drawCar();
        for(Car car:cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
        int makeNewCar = random.nextInt(15);
        int a = random.nextInt(18) * 5 + 30;
        int b = random.nextInt(8) * 10 + 30;
        int c = random.nextInt(4) * 15 + 30;
        if (makeNewCar < 5 )
            return new Audi(a);
        else if (makeNewCar > 10)
            return new Mercedes(b);
        else
            return new Opel(c);
    }
}
