package com.company;

public class SortArrayWithThreeTypesOfElements {
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 1, 1, 2};
        int l = 0, mid = 0, h = arr.length - 1;
        while (mid <= h){
            if(arr[mid] == 0){
                int temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = temp;
                l++; mid++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[h];
                arr[h] = temp;
                h--;
            }
        }

        for (int e : arr){
            System.out.println(e);
        }
    }
}
