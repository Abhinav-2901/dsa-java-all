package com.company;

import java.util.TreeSet;

public class MakeArrayZeroBySubtractingEqualAmounts {
    public static void main(String[] args) {

        int [] nums = {1,5,0,3,5};

        TreeSet<Integer> t = new TreeSet<>();

        for (int e : nums){
            t.add(e);
        }

        int res = 0;

        for (Integer e : t){
            if(e != 0){
                res++;
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] != 0){
                        if(nums[i] - e <= 0){
                            nums[i] = 0;
                        }
                        else {
                            nums[i] = nums[i] - e;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
