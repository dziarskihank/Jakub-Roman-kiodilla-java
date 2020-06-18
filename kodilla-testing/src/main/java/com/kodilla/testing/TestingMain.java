package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test theForumUser jest OK");
        } else {
            System.out.println("Error - test theForumUser !");
        }

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
