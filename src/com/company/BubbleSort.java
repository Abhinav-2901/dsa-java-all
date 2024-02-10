package com.company;

public class BubbleSort {

    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int e : arr){
            System.out.println(e);
        }
    }

    public static void optimisedBubbleSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            boolean swapped = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!swapped){
                break;
            }
        }
        for(int e : arr){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {

        //
        int [] arr = {10, 5, 8 ,20, 2, 18};
        bubbleSort(arr);
        optimisedBubbleSort(arr);
    }
}
