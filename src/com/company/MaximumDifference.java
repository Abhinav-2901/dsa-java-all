package com.company;

public class MaximumDifference{
    public static void main(String[] args) {
        int [] arr = {2, 3, 10, 6, 4, 8, 1};
        int n = arr.length;

        // Naive solution
//        int res = arr[1] - arr[0];
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                res = Math.max(res, arr[j] - arr[i]);
//            }
//        }


        // Efficient solution
        int res = arr[1] - arr[0];
        int minval = arr[0];
        for(int j = 1; j < n; j++){
            res = Math.max(res, arr[j] - minval);
            minval = Math.min(minval, arr[j]);
        }
        System.out.println(res);
    }
}
