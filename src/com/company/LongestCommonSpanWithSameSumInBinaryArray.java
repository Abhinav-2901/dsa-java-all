package com.company;

import java.util.HashMap;

public class LongestCommonSpanWithSameSumInBinaryArray {
    public static void main(String[] args) {
        int [] a = {0,1,0,0,0,0};
        int [] b = {1,0,1,0,0,1};

        int [] arr = new int[a.length];

        for (int i = 0; i< arr.length; i++){
            arr[i] = a[i] - b[i];


        }

        int sum = 0;

        int cur = 0;

        HashMap<Integer,Integer> h = new HashMap<>();

        int pre_sum = 0;

        for (int i = 0; i < arr.length; i++){
            pre_sum+=arr[i];

            if(pre_sum == sum){
                cur = i + 1;
            }
            if(h.containsKey(pre_sum - sum)){
                cur = Math.max(cur, i-h.get(pre_sum-sum));
            }

            if (!h.containsKey(pre_sum)){
                h.put(pre_sum,i);
            }
        }


        System.out.println(cur);
    }
}
