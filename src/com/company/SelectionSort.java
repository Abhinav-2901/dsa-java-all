package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {10, 5, 8 ,20, 2, 18};
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            int mid_ind = i;
            for (int j = i + 1; j < n; j++){
                if(arr[j] < arr[mid_ind]){
                    mid_ind = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mid_ind];
            arr[mid_ind] = temp;
        }

        for (int e : arr){
            System.out.println(e);
        }
    }
}
