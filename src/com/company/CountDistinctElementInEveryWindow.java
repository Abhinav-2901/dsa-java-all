package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class CountDistinctElementInEveryWindow {
    public static void main(String[] args) {
        int [] arr = {0,10,20,10,10,30,40,60};
//        int k = 4;
//
//        int n= arr.length;
//        HashMap<Integer,Integer> h = new HashMap<>();
//        for (int i = 0; i < k; i++){
//            h.put(arr[i], h.getOrDefault(arr[i],0) + 1);
//        }
//
//        System.out.println(h.size());
//
//        for (int i = k; i < n; i++){
//            if(h.get(arr[i-k]) - 1 == 0){
//                h.remove(arr[i-k]);
//            }
//            else {
//                h.put(arr[i-k], h.get(arr[i-k]) - 1);
//            }
//
//            h.put(arr[i], h.getOrDefault(arr[i],0) + 1);
//
//            System.out.println(h.size());
//
//
//        }

        Arrays.sort(arr);
        int sum = 0;
        int count = 1;
        int target = 120;
        for (int i = arr.length-1; i >=0; i--){
            sum = sum + arr[i];
            if(sum >= target){
                System.out.println(count);
                break;
            }
            count++;
        }


    }
}
