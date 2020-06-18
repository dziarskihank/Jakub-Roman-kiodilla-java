package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int sum = calculator.add(1, 2);
        int substructSum = calculator.substruct(3, 3);

        if (sum == 3) {
            System.out.println("Test dodwania zaliczony!");
        } else {
            System.out.println("Test dodawnia niezaliczony!");
        }

        if (substructSum == 2) {
            System.out.println("Test odejmowania zaliczony!");
        } else {
            System.out.println("Test odejmowania niezaliczony!");


        }


    }
}
