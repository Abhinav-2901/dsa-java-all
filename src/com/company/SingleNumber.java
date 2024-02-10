package com.company;

public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {2,2,1,2};

        int one = 0;
        int two = 0;

        for(int e : nums){
            one = one ^ e;
            two = two ^ one;

        }

        System.out.println(one);
        System.out.println(two);
    }
}
