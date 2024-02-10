package com.company;

public class CountingSort {
    public static void main(String[] args) {
        int k = 5;
        int [] arr = {1,4,4,1,0,1};
        int [] count = new int[k];
        for (int j : arr) {
            count[j]++;
        }
        for (int i = 1; i < k; i++){
            count[i] = count[i-1] + count[i];
        }
        int [] output = new int[arr.length];
        for (int i = arr.length-1; i>=0; i--){
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for (int e : output){
            System.out.println(e);
        }
    }
}
