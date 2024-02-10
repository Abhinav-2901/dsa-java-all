package com.company;

public class TrapRainWater {
    public static void main(String[] args) {
        int [] arr = {2,1,4,1,3};
        int n = arr.length;
        int res = 0;


        //Naive solution
//        for(int i = 1; i < arr.length-1; i++){
//            int lmax = arr[i];
//            for (int j = 0; j < i; j++){
//                lmax = Math.max(lmax,arr[j]);
//            }
//            int rmax = arr[i];
//            for (int j = i+1; j < arr.length; j++){
//                rmax = Math.max(rmax,arr[j]);
//            }
//
//            res += Math.min(lmax, rmax) - arr[i];
//        }

        //Efficient Solution

        int [] lmax = new int[arr.length];
        int [] rmax = new int[arr.length];

        lmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }
        rmax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i>= 0; i--){
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            res = res + (Math.min(lmax[i], rmax[i]) - arr[i]);
        }



//        int l = 0;
//        int r = n-1;
//        int currMax = 0;
//        while(l<r){
//            currMax = Math.min(arr[l],arr[r]) * (r-l);
//            res = Math.max(currMax, res);
//            if(arr[l] < arr[r]){
//                l++;
//            }
//            else {
//                r--;
//            }
//        }
        System.out.println(res);
    }
}
