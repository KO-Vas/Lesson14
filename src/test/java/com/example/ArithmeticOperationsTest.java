package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticOperationsTest {
    @Test
    public void testAddition() {
        assertEquals(ArithmeticOperations.add(2, 3), 5);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        ArithmeticOperations.divide(5, 0);
    }
}