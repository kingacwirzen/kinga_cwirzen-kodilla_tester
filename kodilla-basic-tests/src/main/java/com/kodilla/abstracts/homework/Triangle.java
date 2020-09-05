package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(double r) {
        super(r);
    }

    @Override
    public double getArea() {
        return 3 * r;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
