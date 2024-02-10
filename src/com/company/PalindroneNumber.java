package com.company;

public class PalindroneNumber {

    public static boolean CheckPalindrone(int n){
        int temp = n;
        int rev = 0;
        while(temp!=0){
            int r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }
        return (n == rev);
    }
    public static void main(String[] args){
int n = 121;

System.out.println(CheckPalindrone(n));


    }
}
