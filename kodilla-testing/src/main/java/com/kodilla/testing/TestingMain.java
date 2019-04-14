package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.SimpleCalculator.Calculator;

import java.util.Random;

public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("nikName");

        String result = simpleUser.getUsername();

        if(result.equals("nikName"))
            System.out.println("Test ok");
        else
            System.out.println("error");






    }
}
