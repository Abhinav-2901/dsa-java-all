package com.company;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        int left = 2;
        for (int right = 2; right < nums.length; right++){
            if (nums[right] != nums[left-2]){
                nums[left] = nums[right];
                left++;
            }
        }
        System.out.println(left);
    }
}
