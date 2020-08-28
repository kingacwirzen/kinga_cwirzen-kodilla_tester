package com.kodilla.abstracts.homework;

public abstract class Perimeter extends Shape {
    public Perimeter() {
        super(7);
    }

    @Override
    public void getCirlcePerimeter() {
        System.out.println(perimeter);
    }
}
