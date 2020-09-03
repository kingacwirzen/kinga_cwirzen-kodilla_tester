package com.kodilla.abstracts.homework;

public class Perimeter extends Shape {

    public Perimeter(double r) {
        super(r);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }

}
