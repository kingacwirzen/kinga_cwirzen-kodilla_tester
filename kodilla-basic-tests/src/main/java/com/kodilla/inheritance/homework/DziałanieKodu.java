package com.kodilla.inheritance.homework;

public class DziałanieKodu {

    public static void main(String[] args) {
        MacOs macOs = new MacOs(2019);
        macOs.turnOn();

        Windows windows = new Windows(2020);
        windows.turnOf();
    }
}
