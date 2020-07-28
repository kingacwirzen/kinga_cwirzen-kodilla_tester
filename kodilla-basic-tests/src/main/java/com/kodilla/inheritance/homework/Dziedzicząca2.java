package com.kodilla.inheritance.homework;

public class Dziedzicząca1 extends OperatingSystem {
    public Dziedzicząca1(int year);
        super(year);


}
    @Override
    public void turnOf() {
        System.out.println("Też wydanie oprogramowania");
    }

}
