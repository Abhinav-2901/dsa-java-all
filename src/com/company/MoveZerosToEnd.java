package com.company;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int [] arr = {1,0,6,0,6,7,4,0,0,0,5,};

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
