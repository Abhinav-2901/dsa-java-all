package com.company;

import java.util.HashSet;

public class MaximumPairsInArray {
    public static void main(String[] args) {
        int [] nums = {1,3,2,1,3,2,2};

        HashSet<Integer> h = new HashSet<>();

        int pairs = 0;

        for (int e : nums){
            if (!h.add(e)){
                pairs++;
                h.remove(e);
            }
        }

        int [] res = new int[2];

        res[0] = pairs;
        res[1] = h.size();

        for(int e: res){
            System.out.println(e);
        }
    }
}
