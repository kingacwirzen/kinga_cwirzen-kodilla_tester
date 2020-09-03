package com.kodilla.abstracts.homework;

public class Area extends Shape {

    public Area(double r) {
        super(r);
    }

    @Override
    public double getArea() {
        double result1 = PI * r * r;
        return result1;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

}
