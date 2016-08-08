package com.sordonia120446;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*
    Generates an ArrayList of 30 random Integers between 0 & 30.  Searches through to find the pair that
    when added together equals the sum (in this case, sum = 10).
    */
        ArrayList<Integer> myNums = new ArrayList<Integer>();
        int n = 30;
        Integer mySum = 10;
        Random rand = new Random();
        for( int i = 0; i < n; i++ ) {
            Integer randInt = rand.nextInt(n);
            myNums.add(randInt);
        } //end for

        SearchMachine sm = new SearchMachine(myNums,mySum);
        sm.search();
        System.out.println(sm.getMyNums());
    }
}
