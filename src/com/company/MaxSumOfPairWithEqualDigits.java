package com.company;

import java.util.HashMap;

public class MaxSumOfPairWithEqualDigits {
    public static int DigitSum(int n){
        int sum = 0;
        while (n > 0){
            sum = sum + n %10;
            n = n / 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int [] nums = {18,43,36,13,7};

        int ans = -1;

        for(int i = 0; i < nums.length; i++){
            int sum = DigitSum(nums[i]);
            if ((h.containsKey(sum))){
                ans = Math.max(ans, nums[i] + nums[h.get(sum)]);
                if(nums[i] > nums[h.get(sum)]){
                    h.put(sum,i);
                }
            }
            else {
                h.put(sum,i);
            }
        }

        System.out.println(ans);
    }
}
