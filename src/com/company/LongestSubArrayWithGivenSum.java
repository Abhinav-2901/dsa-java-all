package com.company;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr = {1,-1,1,1,1,-1,-1,-1};

        int sum = 0;

        int cur = 0;

        HashMap<Integer,Integer> h = new HashMap<>();

        int pre_sum = 0;

        for (int i = 0; i < arr.length; i++){
            pre_sum+=arr[i];

            if(pre_sum == sum){
//                cur = Math.max(cur, i-h.get(pre_sum-sum));
//                System.out.println(cur);
                cur = i + 1;
            }
            if(h.containsKey(pre_sum - sum)){
                cur = Math.max(cur, i-h.get(pre_sum-sum));
//                System.out.println(cur);
            }

            if (!h.containsKey(pre_sum)){
                h.put(pre_sum,i);
            }
        }


        System.out.println(cur);
    }
}
