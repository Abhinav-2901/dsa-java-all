package com.company;

import java.util.HashMap;

public class TupleWithSameProduct {
    public static void main(String[] args) {
        int [] nums = {2,3,4,6};
        HashMap<Integer,Integer> AB = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                AB.put(nums[i] * nums[j], AB.getOrDefault(nums[i] * nums[j],0) + 1);
            }
        }

        int count = 0;
        for(Integer key: AB.keySet()) {
            int val = AB.get(key);
            count = count + (val*(val-1))/2;
        }
    }
}
