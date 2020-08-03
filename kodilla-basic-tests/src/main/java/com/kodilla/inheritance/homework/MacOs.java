package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem {
    public MacOs(int year) {
        super(2018);
    }

    @Override
    public void turnOn() {
        System.out.println("Włącz MacOS " + year);
    }
}

