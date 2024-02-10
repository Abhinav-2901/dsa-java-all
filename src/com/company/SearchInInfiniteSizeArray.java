package com.company;

public class SearchInInfiniteSizeArray {
    public static void main(String[] args) {
        int [] arr = new int[2000];
        int x = 200;

        // Naive Solution
//        int i = 0;
//        int x = 200;
//        while (true){
//            if(arr[i] == x){
//                System.out.println(i);   // return i;
//            }
//            if(arr[i] > x){
//                System.out.println(-1);  // return -1;
//            }
//            i++;
//        }

        // Efficient solution

        if(arr[0] == x){
            System.out.println(0);    // return 0;
            int  i = 1;
            while (arr[i] < x){
                i = 2 * i;
            }
            if (arr[i] == x){
                System.out.println(i);    // return i;
            }
            System.out.println("Call Binary search for start index as i/2 + 1 and end index as i-1");
        }
    }
}
