package com.company;

public class LeftRotateByK {

    public static void reverse(int [] arr, int l,int h){
        while(l<h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;

            l++; h--;
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n = nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);

        for (int e : nums){
            System.out.println(e);
        }

    }
}
