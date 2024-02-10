package com.company;

public class ShowArushee {
    public static void main(String[] args) {
        double res = 1, x = 2.00000;
        int n = 10;
        int checkneg;

        if(n < 0){
            checkneg = -(n);
        }
        else{
            checkneg = n;
        }

        for(int i = 0; i < checkneg; i++){
            res *= x;
        }

        if(n > 0){
            System.out.println(res);
        }
        else{
            System.out.println(1/res);
        }
        }

}
