package com.company;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr = {5,8,6,13,3,-1};
        int sum = 22;

        HashSet<Integer> h = new HashSet<>();


        int pre_sum = 0;
        for (int e : arr){
            pre_sum+=e;
            if(pre_sum == sum){
                System.out.println(true);
            }
            if (h.contains(pre_sum-sum)){
                System.out.println(true);
            }
            h.add(e);
        }

        System.out.println(false);
    }
}
