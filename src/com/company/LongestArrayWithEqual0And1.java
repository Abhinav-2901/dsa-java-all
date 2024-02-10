package com.company;

import java.util.HashMap;

public class LongestArrayWithEqual0And1 {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,1,0,0,0};
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }

        HashMap<Integer,Integer> h = new HashMap<>();
        int pre_sum = 0;
        int sum = 0;
        int res = 0;
        for (int i = 0; i < n; i++){
            pre_sum += arr[i];

            if(pre_sum == sum){
                res = i + 1;
            }

            if (!h.containsKey(pre_sum)){
                h.put(pre_sum, i);
            }

            if(h.containsKey(pre_sum-sum)){
                res = Math.max(res, i - h.get(pre_sum-sum));
            }
        }

        System.out.println(res);
    }
}
