package com.company;

import java.util.TreeMap;

public class MinimumDivisionToMakeArrayDivisible {
    public static void main(String[] args) {
        int [] nums = {2,3,2,4,3};
        int [] numsDivide = {9,6,9,3,15};

        TreeMap<Integer,Integer> h = new TreeMap<>();
        int ans = 0;
        for (int e : nums){
            h.put(e,h.getOrDefault(e,0) + 1);
        }

        for (Integer elem : h.keySet()){
            int flag = 1;
            for (int i : numsDivide) {
                if (i % elem != 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 0){
                ans += h.get(elem);
            }
            else {
                break;
            }
        }

        if (ans == nums.length){
            System.out.println(-1);
        }
        else System.out.println(ans);
    }
}
