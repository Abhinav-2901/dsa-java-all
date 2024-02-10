package com.company;

public class QuickSortLomuto {

    public static int LomutoPartition(int [] arr, int l, int h){
        int i = l-1;
        int pivot = arr[h];
        for (int j = l; j <= h-1; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }

    public static void quickSort(int [] arr, int l, int h){
        if(l<h){
            int p = LomutoPartition(arr, l, h);
            quickSort(arr,l,p-1);
            quickSort(arr, p+1, h);
        }
    }

    public static void main(String[] args) {
        int [] arr = {10, 80, 30, 90, 40, 50, 70};
        quickSort(arr, 0, arr.length-1);
//        System.out.println(LomutoPartition(arr,0,arr.length-1));
        for(int e : arr){
            System.out.println(e);
        }
    }
}
