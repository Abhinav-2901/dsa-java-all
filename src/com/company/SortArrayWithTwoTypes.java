package com.company;

public class SortArrayWithTwoTypes {
    public static void main(String[] args) {
        int [] arr = {15,-1,-2,-7,8,9,10};
        int l = -1;
        int h = arr.length;
        while(l < h){
            do {
                l++;
            }while (arr[l] < 0);
            do {
                h--;
            }while (arr[h] >= 0 && h>0);
            if(l <= h){
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
            }
        }

        for (int e : arr){
            System.out.println(e);
        }
    }
}
