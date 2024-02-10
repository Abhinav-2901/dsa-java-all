package com.company;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {1,3,5,7};
        int n = nums.length;
        int target = 2;
        int l = 0;
        int h = n - 1;
        int mid = 0;
        while(l <= h){
            mid = (l+h)/2;
            if(nums[mid] == target){
                System.out.println(mid);
            }
            else if(nums[mid] < target){
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }

        System.out.println(h + 1);
    }
}
