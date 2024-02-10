package com.company;

public class MergeSortMain {


    public static void MergeSort(int [] arr, int l, int r){
        if(r > l){
            int m = l + (r - l)/2;
            MergeSort(arr, l, m);
            MergeSort(arr, m+1, r);
            Merge(arr, l, m, r);
        }
    }


    public static void Merge(int [] arr, int l, int m, int r){
        int n1 = m - l +1;
        int n2 = r - m;
        int [] left = new int[n1];
        int [] right = new int[n2];

        for(int i = 0; i < n1; i++){
            left[i] = arr[l + i];
        }
        for(int i = 0; i < n2; i++){
            right[i] = arr[m + 1 + i];
        }
        int i = 0, j= 0, k = l;
        while (i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++; k++;
            }
            else {
                arr[k] = right[j];
                j++; k++;
            }
        }
        while (i < n1){
            arr[k] = left[i];
            i++; k++;
        }
        while (j < n2){
            arr[k] = right[j];
            j++; k++;
        }


    }
    public static void main(String[] args) {
        int [] arr = {10, 5, 30, 15, 7};
        int n = arr.length;
        MergeSort(arr, 0, n-1);
        for (int e : arr){
            System.out.println(e);
        }

    }
}
