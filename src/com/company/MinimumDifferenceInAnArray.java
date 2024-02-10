package com.company;

import java.util.Arrays;

public class MinimumDifferenceInAnArray {
    public static void main(String[] args) {
        int [] arr = {5,10,30,15,100,101};
        Arrays.sort(arr);
        int n = arr.length;
        int min_diff = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++){
            min_diff = Math.min(min_diff, Math.abs(arr[i]) -  Math.abs(arr[i-1]));
        }

        System.out.println(min_diff);

    }
}
