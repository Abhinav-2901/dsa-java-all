package com.company;

public class PlusOne {
    public static void main(String[] args) {
        int [] digits = {8,9,9,9};
        int n = digits.length;

        for(int i = n-1; i >=0; i--){
            digits[i] = digits[i] + 1;
            if(digits[i] < 10){
                System.out.println(digits[i]);
            }
            else{
                digits[i] = 0;
            }
        }

        int [] temp = new int[n+1];
        temp[0] = 1;
        for(int i = 1; i < n+1; i++){
            temp[i] = 0;
        }
    }
}
