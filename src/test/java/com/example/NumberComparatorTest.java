package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTest {
    @Test
    public void testComparison() {
        assertEquals(NumberComparator.compare(5, 3), "5 > 3");
        assertEquals(NumberComparator.compare(2, 2), "2 == 2");
    }
}