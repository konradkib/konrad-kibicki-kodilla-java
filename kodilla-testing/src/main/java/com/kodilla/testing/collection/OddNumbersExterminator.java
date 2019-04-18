package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> oddDigits = new ArrayList<>();

        for(Integer i : numbers) {
            if ((i % 2) == 0) {
                oddDigits.add(i);
            }
        }
        return oddDigits;
    }
}



