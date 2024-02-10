package com.company;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        
        int [] nums = {0,1,2,2,3,0,4,2};
        int n = nums.length;
        int res = 0;
        int val = 2;
        for (int i = 0; i < n; i++){
            if(nums[i] == val){
                res++;
            }
            else {
                nums[i-res] = nums[i];
            }
        }
        System.out.println(n-res);


        for(int e : nums){
            System.out.println(e);
        }
    }
}
