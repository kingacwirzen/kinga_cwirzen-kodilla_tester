package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int year) {
        super(2020);
    }

    @Override
    public void turnOf() {
        System.out.println("Wyłącz Windows " + year);
    }
}
