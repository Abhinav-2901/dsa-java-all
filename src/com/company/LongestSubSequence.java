package com.company;

import java.util.HashSet;

public class LongestSubSequence {
    public static void main(String[] args) {
        int [] arr = {1,3,9,2,8,5,4,6};

        HashSet<Integer> h = new HashSet<>();

        for (int i: arr){
            h.add(i);
        }

        int res = 1;
        for (Integer e : h){
            if(!h.contains(e-1)){
                int cur = 1;
                while (h.contains(e+cur)){
                    cur++;
                }

                res = Math.max(res,cur);
            }
        }

        System.out.println(res);
    }
}
