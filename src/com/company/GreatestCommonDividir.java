package com.company;

public class GreatestCommonDividir {

    public static int GCD(int a, int b){
        int gcd = 0;
        int min = 0;
        if(a>=b){
            min = b;
        }
        else{
            min = a;
        }

        for(int i = 1; i < min; i++){
            if(a%i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        System.out.println(GCD(a,b));
    }
}
