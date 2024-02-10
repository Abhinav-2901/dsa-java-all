package com.company;

public class RearrangeBinaryString {
    public static void main(String[] args) {
        String s = "11100";
        char [] temp = s.toCharArray();

        int res = 0;

        for (int i = 1; i < temp.length; i++){
            if(temp[i] == '1' && temp[i-1] == '0'){
                temp[0] = '1';
                temp[1] = '0';
                res++;
            }
        }

        System.out.println(res);
    }
}
