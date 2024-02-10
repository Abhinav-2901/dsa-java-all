package com.company;

public class TrailingZeroesCount {

    public static int TZcount(int n){
        int count = 0;
        while (n != 0){
            int r = n % 10;
            if(r==0){
                count++;
            }
            else{
                break;
            }
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 123400;
        System.out.println(TZcount(n));
    }
}
