package com.company;

import java.util.HashSet;

public class MEXSubsequence {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,2,1,1,1,10};
        int sum = 0;
        int n = arr.length;
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        if(max <= 0){
            System.out.println(1);
        }

        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                sum += arr[i];
            }
        }

        HashSet<Integer> h = new HashSet<>();
        for (int e : arr){
            h.add(e);
        }

        for(int i = 1; i < max ; i++){
            if(!h.contains(i)){
                System.out.println(i);
                break;
            }
        }

//        System.out.println(sum);
    }
}
