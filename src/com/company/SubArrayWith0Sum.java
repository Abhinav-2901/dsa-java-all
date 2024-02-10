package com.company;

import java.util.HashSet;

public class SubArrayWith0Sum {
    public static void main(String[] args) {
        int [] arr = {1,4,13,-3,-10,5};

        HashSet<Integer> h = new HashSet<>();

        int pre_sum = 0;

        for (int e: arr){
            pre_sum+=e;
            if(h.contains(pre_sum)){
                System.out.println(true);
                break;
            }
            if (pre_sum == 0){
                System.out.println(true);
                break;
            }
            h.add(pre_sum);
        }
        System.out.println(false);         // If not true then false
    }
}
