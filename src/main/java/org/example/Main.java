package org.example;

import org.example.calculator.SumCalculator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sum = new SumCalculator().sum(7);
        System.out.println("sum = " + sum);
    }
}