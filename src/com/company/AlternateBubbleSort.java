package com.company;

public class AlternateBubbleSort {


    public static void printArray(int [] arr){
        for (int e : arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {20,10,15,90,6};

        int n = arr.length;

        System.out.println("Original Array :");
        printArray(arr);


        for(int i = 0; i< n; i++){


            if(i % 2 == 0){
                for (int j = 0; j < n-1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            else{
                for(int j = n-1; j > 0; j--){
                    if(arr[j] < arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }
            System.out.println(i+1+"th Pass : ");
            printArray(arr);
        }
    }
}
