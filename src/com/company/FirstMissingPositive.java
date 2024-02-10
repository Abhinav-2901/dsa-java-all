package com.company;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums = {2147483640};
        int n = nums.length;
        int [] count = new int[n+1];

        for (int num : nums) {
            if(num > 0 && num <= n){
                count[num]++;
            }
        }
        for (int i = 1; i < count.length; i++){
            if(count[i] == 0){
                System.out.println(i);
                break;
            }
        }
        System.out.println(n+1); // Only when we have all the elements except the biggest
    }
}
