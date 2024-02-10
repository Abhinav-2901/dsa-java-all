package com.company;

import java.util.Arrays;

public class sum_closest {
    public static void main(String[] args) {
        int [] nums = {0,1,2};
        int n = nums.length;
        Arrays.sort(nums);
        int target = 3;
        int sum = 0;
        int temp = 0;
        int dmax = Integer.MAX_VALUE;
        int fmax = 0;
        for(int i = 0; i < n; i++){
            int s = i+1;
            int e = n-1;
            for(int j = i+1; j < n; j++){
                if(s!=e){
                    sum = 0;
                    sum = nums[i] + nums[s] + nums[e];
                    System.out.println("Sum "+sum);
                    if(sum < target){
                        s++;
                    }
                    else {
                        e--;
                    }
                    temp = sum;
                    if(sum > 0 && target > 0){
                        sum = Math.abs(sum-target);
                    }
                    else if(sum < 0 && target < 0){
                        sum = Math.abs(Math.abs(sum) - Math.abs(target));
                    }
                    else {
                        sum = (Math.max(sum,target) + Math.abs(Math.min(sum,target)));
                    }

                    System.out.println("Diff "+sum);
                    if(sum < dmax){
                        dmax = sum;
                        fmax = temp;
                    }
                }
            }
        }
        System.out.println(dmax+"--------Sum = "+fmax);
    }
}
