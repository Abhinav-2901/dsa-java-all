package com.company;

public class CountOccurance {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,4,4,4,5,6};
        int target = 4;
        int first = FirstLastOccuranceInSortedArray.firstOccurance(nums, target);
        if(first == -1){
            System.out.println(0);
        }
        else {
            System.out.println(FirstLastOccuranceInSortedArray.lastOccurance(nums,target) - first + 1);
        }
    }
}
