package com.company;

public class MinimumAmountOfTimeToFillCups {
    public static void main(String[] args) {
        int [] amount = {5,0,0};
        int res = 0;

        int diff = Math.abs(amount[0] - amount[1]);
        res = Math.min(amount[0],amount[1]);

        int max = Math.max(diff,amount[2]);

        diff = Math.abs(amount[2] - diff);



        res += Math.min(diff,amount[2]);

        res += max - diff;




        System.out.println(res);


    }
}
