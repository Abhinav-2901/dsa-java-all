package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class FirstLetterToApperatwice {
    public static void main(String[] args) {
        String s = "abccbaacz";

        char res = ' ';
        HashSet<Character> h = new HashSet<>();

        for (int i = 0; i < s.length(); i++){
            if(h.contains(s.charAt(i))){
                res = s.charAt(i);
                break;
            }
            else {
                h.add(s.charAt(i));
            }
        }

        System.out.println(res);
    }
}
