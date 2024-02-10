package com.company;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,3,4,4,5,6};
        int n = nums.length;
        int res = 1;
        for (int i = 1; i < n; i++){
            if(nums[res - 1] != nums[i]){
                nums[res] = nums[i];
                res++;
            }
        }
        System.out.println(res);
    }
}
