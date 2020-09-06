package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Seat;
import com.kodilla.collections.interfaces.homework.Audi;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("____________");
        System.out.println("Car kind: " + getCarName(car));
    }
    private static String getCarName(Car car) {
        if (car instanceof BMW)
            return "BMW";

        else if (car instanceof Seat)
            return "Seat";

        else if (car instanceof Audi)
            return "Audi";

        else
            return "Unknown car name";
    }
}
