package com.kodilla.abstracts.homework;

public class Area extends Shape {

    public Area(double r) {
        super(r);
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

}
