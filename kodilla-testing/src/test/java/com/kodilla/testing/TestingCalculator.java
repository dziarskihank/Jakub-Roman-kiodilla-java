package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

class TestingMain {
    public static void main(String[] args){

        Calculator testPair = new Calculator(15, 25);
        int adding = testPair.add();
        int substracting = testPair.substract();

        if (adding == 40)
        {
            System.out.println("Test dodawania jest OK");
        }
        else
        {
            System.out.println("Dodawanie Error");
        }

        if (substracting == -10)
        {
            System.out.println("Test odejmowania jest OK");
        }
        else
        {
            System.out.println("Odejmowanie error");
        }
    }
}