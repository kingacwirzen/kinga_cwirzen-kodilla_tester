package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    public Circle(double r) {
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
