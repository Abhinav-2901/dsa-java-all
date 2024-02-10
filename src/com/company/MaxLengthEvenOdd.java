package com.company;

public class MaxLengthEvenOdd {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 6, 3, 8};
        int cur = 1;
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if((arr[i-1] % 2 == 0 && arr[i] % 2 == 1) || (arr[i-1] % 2 == 1 && arr[i] % 2 == 0)){
                count++;
            }
            else {
                cur = Math.max(count, cur);
                count = 1;
            }
        }
        System.out.println(Math.max(count,cur));

    }
}
