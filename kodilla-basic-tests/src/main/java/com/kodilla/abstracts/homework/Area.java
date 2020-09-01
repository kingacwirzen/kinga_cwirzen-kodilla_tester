package com.kodilla.abstracts.homework;

public abstract class Area extends Shape {

    public Area(double r) {
        super(r);
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }
}
