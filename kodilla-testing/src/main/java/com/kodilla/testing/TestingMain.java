package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
import java.util.*;



public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("nikName");

        String result = simpleUser.getUsername();

        if(result.equals("nikName"))
            System.out.println("Test ok");
        else
            System.out.println("error");

        System.out.println("------------------ NEW TEST -------------------------" );

        Random random = new Random();

        int a = random.nextInt(100);
        int b = random.nextInt(100);
        Calculator calculator = new Calculator(a,b);

        int AddResult = calculator.addAToB();
        int SubResult = calculator.subtractAToB();

        if((AddResult == (a+b)) || (SubResult == (a-b)))
            System.out.println("Test ok");
        else if(AddResult != (a+b))
            System.out.println("Add method wrong result");
        else if(SubResult != (a-b))
            System.out.println("Sub method wrong result");
        else
            System.out.println("Both methods works wrong");






    }
}
