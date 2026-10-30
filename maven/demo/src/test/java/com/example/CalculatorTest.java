package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();

        int result = c.add(10, 20);

        assertEquals(30, result);
    }

    @Test
    public void testSubtract() {
        Calculator c = new Calculator();

        int result = c.subtract(20, 10);

        assertEquals(10, result);
    }
}