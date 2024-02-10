package com.company;

import java.util.Arrays;

public class MeetingMaximumGuests {
    public static void main(String[] args) {
        int [] arr = {990,600,700};
        int [] dep = {1000,800,730};
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int i = 1; int j = 0; int res = 1; int curr = 1;
        while (i < n && j<n){
            if(arr[i] <= dep[j]){
                i++; curr++;
            }
            else {
                j++; curr--;
            }

            res = Math.max(res,curr);
        }

        System.out.println(res);
    }
}
