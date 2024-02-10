package com.company;

public class PrintinhBoundaryOfMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        if(arr.length == 1){
            for (int i = 0; i < arr[0].length; i++){
                System.out.println(arr[0][i]+" ");
            }
        }
        else if (arr[0].length == 1){
            for (int[] ints : arr) {
                System.out.println(ints[0] + " ");
            }
        }
        else {
            for (int i = 0; i < arr[0].length; i++){
                System.out.println(arr[0][i] + " ");
            }
            for (int i = 1; i< arr.length; i++){
                System.out.println(arr[i][arr[0].length-1]);
            }
            for (int i = arr[0].length - 2; i >= 0; i--){
                System.out.println(arr[arr.length-1][i]);
            }
            for (int i = arr.length - 2; i > 0; i--){
                System.out.println(arr[i][0]);
            }
        }
    }
}
