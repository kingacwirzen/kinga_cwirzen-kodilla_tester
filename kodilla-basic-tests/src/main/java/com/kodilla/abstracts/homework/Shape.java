package com.kodilla.abstracts.homework;

public abstract class Shape {
    public static double PI = 3.14;
    public double r;
    public double z;

    public Shape(double r, double z) {
        this.r = r;
        this.z = z;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}





