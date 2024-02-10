package com.company;

public class leftmoveByOne {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};

        // Naive solution

//        for(int d = 0; d < 2; d++){
//            int temp = arr[0];
//            for (int i = 0; i < arr.length-1; i++){
//                arr[i] = arr[i+1];
//            }
//            arr[arr.length-1] = temp;
//        }

        // Efficient solution

        int d = 2;
        int step = d;

        for(int i = 0; i < arr.length-step; i++){
            int temp = arr[i];
            arr[i] = arr[d];
            arr[d] = temp;
            d++;
        }


        if(arr.length % 2 != 0){
            int t = arr[arr.length-1];
            arr[arr.length-1] = arr[arr.length / 2];
            arr[arr.length / 2] = t;
        }


        for (int j : arr){
            System.out.println(j);
        }
    }
}
