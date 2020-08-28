package com.kodilla.abstracts.homework;

public abstract class Shape {
    public static double PI = 3.14;
    public double r;
    public double area;
    public double perimeter;

    public Shape(double r) {
        this.r = r;
    }

    public abstract double getCircleArea();

    public abstract double getCirclePerimeter();

    public abstract void getCirlcePerimeter();
}





