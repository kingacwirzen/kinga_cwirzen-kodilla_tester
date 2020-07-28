package com.kodilla.inheritance.homework;

public class Dziedzicząca1 extends OperatingSystem {
    public Dziedzicząca1(int year);
        super(year);
}
    @Override
    public void turnOn() {
        System.out.println("Wydanie oprogramowania");
    }

}

