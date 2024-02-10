package com.company;

public class QuickSortHoare {

    public static int HoarePartition(int [] arr, int l, int h){
        int pivot = arr[l];
        int i = l-1;
        int j = h+1;
        while (true){
            do {
                i++;
            }while (arr[i] < pivot);
            do {
                j--;
            }while (arr[j] > pivot);

            if(i >= j){
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void QuickSort(int [] arr, int l, int h){
        if(l < h){
            int p = HoarePartition(arr,l,h);
            QuickSort(arr, l, p);
            QuickSort(arr, p+1, h);
        }
    }

    public static void main(String[] args) {
        int [] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        QuickSort(arr,0,arr.length-1);
        for (int e : arr){
            System.out.println(e);
        }
    }
}
