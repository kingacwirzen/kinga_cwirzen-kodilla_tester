package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 9;
        int b = 4;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(5, subtractResult);
    }
    @Test
    public void testInvolution() {
        Calculator calculator = new Calculator();
        int a = -4;
        int b = 0;
        int c = 3;
        int involution1Result = calculator.involution(a);
        assertEquals(16, involution1Result);
        int involution2Result = calculator.involution(b);
        assertEquals(0, involution2Result);
        int involution3Result = calculator.involution(c);
        assertEquals(9, involution3Result);
    }
}
