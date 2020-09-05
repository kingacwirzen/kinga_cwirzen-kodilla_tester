package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Square perimeter = new Square(7);
        perimeter.getPerimeter();

        Circle area = new Circle(5);
        area.getArea();

        Triangle triangle = new Triangle(4);
        triangle.getArea();
        }

}

