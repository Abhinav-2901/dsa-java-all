package com.company;

import java.util.HashSet;

public class NumberOfArithmaticTriplets {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,8,9}; int diff = 2;
        HashSet<Integer> h = new HashSet<>();
        int count = 0;
        for (int e : nums){
            if(h.contains(e-diff) && h.contains(e-diff-diff)){
                count++;
                h.add(e);
            }
            else {
                h.add(e);
            }
        }

        System.out.println(count);
    }
}
