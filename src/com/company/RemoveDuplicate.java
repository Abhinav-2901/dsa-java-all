package com.company;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "bcabc";

        HashSet<Character> h = new HashSet<>();

        for (int i = 0; i< s.length(); i++){
            h.add(s.charAt(i));
        }

        StringBuilder res = new StringBuilder();

        for (char c : h){
            res.append(c);
        }

        System.out.println(res);
    }
}
