package com.kodilla.abstracts.homework;

public class Perimeter extends Shape {

    public Perimeter(double r) {
        super(r);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }
}
