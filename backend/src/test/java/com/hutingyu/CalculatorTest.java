package com.hutingyu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    void addWorks() {
        assertEquals(4.0, c.eval("2", "+", "2"));
    }

    @Test
    void subtractWorks() {
        assertEquals(7.0, c.eval("10", "-", "3"));
    }

    @Test
    void multiplyWorks() {
        assertEquals(20.0, c.eval("4", "*", "5"));
    }

    @Test
    void divideNormalWorks() {
        assertEquals(2.0, c.eval("6", "/", "3"));
    }

    @Test
    void testNegativeBoundary(){
        assertEquals(-3.0, c.eval("2", "+", "-5"));
    }

    @Test
    void divideByZeroThrows(){
        assertThrows(ArithmeticException.class, ()-> c.eval("10","/","0"));
    }

    @Test
    void blankInputThrows(){
        assertThrows(IllegalArgumentException.class, ()-> c.eval("","+","9"));
    }
}
