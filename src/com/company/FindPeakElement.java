package com.company;

public class FindPeakElement {
    public static void main(String[] args) {
        int [] nums = {5, 20, 40, 30, 20, 50, 60};
        int n = nums.length;
        int l = 0;
        int h = n-1;
        int mid = 0;
        while (l <= h){
            mid = (l+h)/2;
            if((mid == 0 || nums[mid - 1] <= nums[mid]) && (mid == n-1 || nums[mid+1] <= nums[mid]) ){
                System.out.println(mid);
                break;
            }
            if(mid > 0 && nums[mid - 1] >= nums[mid]){
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
    }
}
