package com.company;

public class SearchInSortedRoatedArray {
    public static void main(String[] args) {
        int [] nums = {10, 20, 30 ,40, 60, 5 ,8};
        int n = nums.length;
        int target = 60;
        int l = 0;
        int h = n - 1;
        int mid = 0;
        while (l <= h){
            mid = (l + h)/2;
            if (nums[mid] == target){
                System.out.println(mid);
                break;
            }
            if(nums[mid] > nums[l]){
                if(target > nums[l] && target < nums[mid]){
                    h = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target < nums[h]){
                    l = mid + 1;
                }
                else {
                    h = mid - 1;
                }
            }
        }
    }
}
