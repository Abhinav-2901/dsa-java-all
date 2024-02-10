package com.company;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int [] nums = {10,20,10,20,30,40,50,10};

        HashSet<Integer> h = new HashSet<>();
        int count = 0;
        for (int e : nums){
            if(h.add(e)){
                count++;
            }
        }
        System.out.println(count);
    }
}
