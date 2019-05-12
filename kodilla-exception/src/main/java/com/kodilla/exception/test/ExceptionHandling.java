package com.kodilla.exception.test;

import java.time.LocalTime;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            String result = secondChallenge.probablyIWillThrowException(1.75,1.5);
            System.out.println("Result "+result);

        }catch (Exception e){
            System.out.println("Exception occur, Error: "+e);
        }finally {
            System.out.println("Last try "+ LocalTime.now());
        }

    }
}
