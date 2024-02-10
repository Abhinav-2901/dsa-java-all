package com.company;

public class MaxConsOnes {
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,0,1,1,1,1,0,0,0,0,0,1,1,1,1};
        int max1 = 0;
        int curMax1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                max1++;
            }
            else {
                if (curMax1 <= max1){
                    curMax1 = max1;
                }
                max1 = 0;
            }
        }
        System.out.println(curMax1);
    }
}
