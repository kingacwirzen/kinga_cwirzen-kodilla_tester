package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(double r) {
        super(r);
    }

    @Override
    public double getArea() {
        return 4 * r;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

}
