package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subtractResult = calculator.subtract(a, b);
        boolean correctSub = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSub) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int involutionResult = calculator.involution(a);
        boolean correctInv = ResultChecker.assertEquals(25, involutionResult);
        if (correctInv) {
            System.out.println("Metoda involution działa poprawnie dla liczb " + a);
        } else {
            System.out.println("Metoda involution nie działa poprawnie dla liczby " + a);
        }
        }

    }


