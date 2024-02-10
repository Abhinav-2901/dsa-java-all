package com.company;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {

    public static int NaiveMethod(String str){
        for (int i = 0; i < str.length(); i++){
            for (int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    return i;
                }
            }
        }

        return -1;
    }

    public static int EfficientSolution1(String str){
        int [] count = new int[123];
        for (int i = 0; i < str.length(); i++){
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++){
            if (count[str.charAt(i)] > 1){
                return i;
            }
        }
        return -1;
    }


    public static int EfficientSolution2(String str){
        int [] count = new int[123];
        int res = Integer.MAX_VALUE;
        Arrays.fill(count, -1);
        for (int i = 0; i< str.length(); i++){
            int fi = count[str.charAt(i)];
            if(fi == -1){
                count[str.charAt(i)] = i;
            }
            else {
                res = Math.min(res,fi);
            }
        }

        return (res == Integer.MAX_VALUE ? -1 : res);
    }

    public static int EfficientSolution3(String str){
        boolean [] visited = new boolean[123];
        int res = -1;
        for (int i = str.length()-1; i >= 0; i--){
            if (!visited[str.charAt(i)]){
                visited[str.charAt(i)] = true;
            }
            else{
                res = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "abccbda";
        System.out.println(NaiveMethod(str));
        System.out.println(EfficientSolution1(str));
        System.out.println(EfficientSolution2(str));
        System.out.println(EfficientSolution3(str));
    }
}
