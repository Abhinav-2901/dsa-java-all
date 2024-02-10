package com.company;

public class SubArrayProductLessThenK {
    public static void main(String[] args) {

        int [] nums = {10,5,2,6};
        int k = 100;
        int res = 0;
        int cur_prod = 1, i = 0;
        for(int j = 0; j < nums.length; j++){
            cur_prod = cur_prod * nums[j];
//            if(cur_prod < k){
//                res = res + (j-i+1);
//            }
            if(cur_prod>=k){
                while (cur_prod >= k && i <= j){
                    cur_prod = cur_prod / nums[i];
                    i++;
                }
            }
            res = res + (j - i + 1);
        }


        System.out.println(res);
    }
}
