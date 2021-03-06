package com.kodilla.collections.arrays.homework;

import java.util.Random;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Seat;
import com.kodilla.collections.interfaces.homework.Audi;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
        }
        for ( Car Car : cars) {
            CarUtils.describeCar(Car);
        }
}

    private static Car drawCar() {
            Random random = new Random();
            int getCarName = random.nextInt(3);
            int a = random.nextInt() * 100 + 1;
;

            if (getCarName == 0) {
                return new BMW((int) a);
            }
            else if (getCarName == 1) {
                return new Seat((int) a);
            }
            else {
                return new Audi((int) a);
            }
        }
    }
