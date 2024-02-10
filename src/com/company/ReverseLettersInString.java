package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class ReverseLettersInString {
    public static void main(String[] args) {
        String s = "    Hello India      is   my   country";
//        String word = "";
//        boolean flag = false;
//        String res = "";
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) != 32){
//                flag = true;
//            }
//            else{
//                flag = false;
//            }
//            if(flag){
//                word = s.charAt(i) + word;
//            }
//
//            if(!flag && word.length() != 0){
//                if(res.length() == 0){
//                    res = word;
//                    word = "";
//                }
//                else{
//                    res = res + " " + word;
//                    word = "";
//                }
//            }
//        }
//
//        if(word.length() != 0){
//            res = res + " " + word;
//        }


        int [][] nums = {{1,2},{2,3},{3,4}};
//        System.out.println(res);
        TreeMap<Integer,Integer> t = new TreeMap<>();

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i][1]);
        }
    }
}
