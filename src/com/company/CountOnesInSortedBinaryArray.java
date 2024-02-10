package com.company;

public class CountOnesInSortedBinaryArray {
    public static void main(String[] args) {
        int [] nums = {0, 0, 1, 1, 1, 1};
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int mid = 0;
        while (l <= h){
            mid = (l + h)/2;
            if(nums[mid] == 0){
                l = mid + 1;
            }
            else {
                if (mid == 0 || nums[mid -1] == 0){
                    System.out.println(n - mid);
                    break;
                }
                else {
                    h = mid - 1;
                }
            }
        }
    }
}
