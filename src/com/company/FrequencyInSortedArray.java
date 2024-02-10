package com.company;

public class FrequencyInSortedArray {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30,30,30,80,90,90,100,100,100,1000,10000};
        int count = 1;
        int n = arr.length;
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else {
                System.out.println(arr[i-1]+"-----------"+count);
                count = 1;
            }
        }
        System.out.println(arr[n-1]+"-----------"+count);
    }
}
