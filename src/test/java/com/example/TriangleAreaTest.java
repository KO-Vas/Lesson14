package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {
    @Test
    void testValidTriangle() {
        assertEquals(6.0, TriangleArea.calculateArea(3, 4, 5), 0.001);
    }

    @Test
    void testInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.calculateArea(1, 1, 3));
    }
}