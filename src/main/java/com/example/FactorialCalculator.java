package com.example;

public class FactorialCalculator {
    public static long calculateFactorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        return n == 0 ? 1 : n * calculateFactorial(n - 1);
    }
}