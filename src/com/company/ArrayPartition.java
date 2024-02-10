package com.company;

public class ArrayPartition {
    public static void main(String[] args) {
        int [] nums = {1,1,1,0,6,12};
        int res = 0;
        int leftMax = nums[0];
        int greater = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (greater <= nums[i]) {
                greater = nums[i];
            } else if (nums[i] < leftMax) {
                res = i;
                leftMax = greater;
            }
        }
        System.out.println(res + 1);
    }
}
