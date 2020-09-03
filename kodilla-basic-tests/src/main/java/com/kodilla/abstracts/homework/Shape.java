package com.kodilla.abstracts.homework;

public abstract class Shape {
    public static double PI = 3.14;
    public double r;


    public Shape(double r) {
        this.r = r;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}





