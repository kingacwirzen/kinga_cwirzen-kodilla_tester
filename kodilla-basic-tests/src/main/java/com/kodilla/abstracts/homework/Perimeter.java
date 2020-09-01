package com.kodilla.abstracts.homework;

public abstract class Perimeter extends Shape {

    public Perimeter(double z) {
        super(z);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * z;

    }
}
