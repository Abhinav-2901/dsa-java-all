package com.company;

public class NumberOfZeroFilledSubArray {
    public static void main(String[] args) {
        int [] nums = {0,0,0,2,0,0};

        long res = 0;

        int count = 0;

        for (int num : nums) {
            if (num == 0) {
                count++;
            } else {
                int temp = count * (count + 1) / 2;
                res += temp;
                count = 0;
            }
        }

        System.out.println(nums[nums.length - 1]);

        if(nums[nums.length - 1] == 0){
            int temp = count * (count + 1) / 2;
            res += temp;
        }

        System.out.println(res);
    }
}
