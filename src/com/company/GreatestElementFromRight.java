package com.company;

public class GreatestElementFromRight {
    public static void main(String[] args) {
        int [] arr = {17,18,5,4,6,1};
        int n = arr.length;
        int mfr = arr[n-1];
        arr[n-1] = -1;

        for(int i = n-2; i>=0; i--){
            int temp = arr[i];
            arr[i] = mfr;

            if(mfr < temp){
                mfr = temp;
            }
        }

        for(int e : arr){
            System.out.println(e);
        }
    }
}
