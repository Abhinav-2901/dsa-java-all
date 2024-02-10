package com.company;


import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {

        String s = " ";
        HashSet<Character> h = new HashSet<>();

        int res = 0;
        int count = 0;

        for (int i = 0; i< s.length(); i++){
            if(h.contains(s.charAt(i))){
                res = Math.max(res,count);
                if(i != 0 && s.charAt(i) == s.charAt(i-1)){
                    count = 1;
                }
                else {
                    count = 0;
                }
            }
            else {
                h.add(s.charAt(i));
                count++;
            }
        }
        System.out.println(res);

    }
}
