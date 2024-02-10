package com.company;

import java.util.Arrays;

public class LeftmostNonRepeatingCharacter {

    public static int NaiveSolution(String str){
        for (int i = 0; i< str.length(); i++){
            boolean flag = true;
            for (int j = 0; j <str.length(); j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }


    public static int EfficientSolution(String str){
        int [] count = new int[123];
        Arrays.fill(count, -1);
        for (int i = 0; i < str.length(); i++){
            if(count[str.charAt(i)] == -1){
                count[str.charAt(i)] = i;
            }
            else {
                count[str.charAt(i)] = -2;
            }
        }

        int res = Integer.MAX_VALUE;
        for (int e : count){
            if (e > 0){
                res = Math.min(res, e);
            }
        }

        return (res == Integer.MAX_VALUE? -1 : res);
    }
    public static void main(String[] args) {
        String str = "abcbadcde";
        System.out.println(NaiveSolution(str));
        System.out.println(EfficientSolution(str));
    }
}
