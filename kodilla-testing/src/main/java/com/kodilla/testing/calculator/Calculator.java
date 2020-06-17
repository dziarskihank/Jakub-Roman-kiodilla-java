package com.kodilla.testing.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int substruct(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sum = calculator.add(1, 2);
        int substructSum = calculator.substruct(3, 3);

        System.out.println("Dodawanie:" + sum);
        System.out.println("Odejmowanie:" + substructSum);

    }

}