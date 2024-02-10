package com.company;

public class KthSmallestElement {
    public static void main(String[] args) {
        int [] arr = {10, 4, 5, 8, 11, 6, 26};
        int l = 0;
        int h = arr.length - 1;
        int k = 5;
        while (l <= h){
            int p =QuickSortLomuto.LomutoPartition(arr,l,h);
            if(p == k - 1){
                System.out.println(arr[p]);
                break;
            }
            else if (p > k -1){
                h = p - 1;
            }
            else {
                l = p + 1;
            }
        }
    }
}
