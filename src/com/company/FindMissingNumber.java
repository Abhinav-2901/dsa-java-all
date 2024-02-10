package com.company;

import java.util.Arrays;

public class FindMissingNumber {


    public static int findMissing(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res = res ^ arr[i];
        }
        for(int i = 1; i <= arr.length+1; i++){
            res = res ^ i;
        }
        return res;
    }

    public static int findMissingUsingSum(int [] arr){
        int n = arr.length;
        int Tsum = (n*(n+1))/2;
        int sum = Arrays.stream(arr).sum();
        return Tsum-sum;
    }
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,8,0,1};
//        System.out.println(findMissing(arr));
        System.out.println(findMissingUsingSum(arr));
    }

}
