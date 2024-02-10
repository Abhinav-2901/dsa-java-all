package com.company;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        int fm = Integer.MIN_VALUE;
        int sm = Integer.MIN_VALUE;
        int tm = Integer.MIN_VALUE;
        for(int e : nums){
            if( e > fm){
                tm = sm;
                sm = fm;
                fm = e;
            }
            else if( e < fm){
                if(e > sm){
                    tm = sm;
                    sm = e;
                }
            }
            else {
                if(e > tm){
                    tm = e;
                }
            }
        }

        if(tm == Integer.MIN_VALUE){
            System.out.println(fm);
        }else{
            System.out.println(sm);
        }
    }
}
