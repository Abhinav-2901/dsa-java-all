package com.company;

public class SlidingWindowProblem {
    public static void main(String[] args) {
        int [] arr = {1, 8, 30, -5, 20, 7};
        int n = arr.length;
        int sum = 0;
        for(int i = 2; i < n; i++){
            int cur_sum = arr[i] + arr[i-1] + arr[i-2];
            sum = Math.max(cur_sum,sum);

        }

        System.out.println(sum);
    }
}
