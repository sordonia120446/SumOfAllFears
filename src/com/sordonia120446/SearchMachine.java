package com.sordonia120446;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;


/**
 * Created by SamO on 8/2/16.
 *
 * Takes in an ArrayList of integers in arbitrary order.
 * Create a set of integers
 */
public class SearchMachine {

    private Set<Integer> mKeys;
    private ArrayList<Integer> mNums;
    private Integer num1;
    private Integer num2;
    private Integer mSum;
    private int cntr;
    private boolean done;

    public SearchMachine(ArrayList<Integer> myNums, Integer sum) {
        this.mNums = myNums;
        mSum = sum;
        done = false;
        mKeys = new HashSet<Integer>();
        cntr = 0;

        mKeys.add(myNums.get(cntr));
        cntr++;
    }

    public ArrayList<Integer> getMyNums() {
        System.out.println("The numbers in the ArrayList are...\n");
        return mNums;
    } //end method getMyNums

    public Set<Integer> getMyKeys() {
        return mKeys;
    }

    public void search() {
        // Loops so long as the pair of additives isn't found or the entire ArrayList of Integers hasn't
        // been looped through.  Each Integer of the input ArrayList is compared to the difference between the sum
        // and itself along the HashSet mKeys.  This is the clutch move that turns this O(n^2) into O(n)!
        while (!done) {
            num2 = mNums.get(cntr);
            num1 = mSum - num2;

            if (mKeys.contains(num1)) {
                System.out.printf("We found our pair!...%d and %d\n\n",num1,num2);
                done = true;
            } //end if

            mKeys.add(num2);
            cntr++;

            if (cntr > mNums.size()) {
                System.out.println("Unable to find a matching pair of Integers.  Sorry :(\n");
                done = true;
            }
        } //end while
    }

    public Integer getNum1() {
        return num1;
    }

    public Integer getNum2() {
        return num2;
    }


} //end class SearchMachine
