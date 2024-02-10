package com.company;

import java.util.HashSet;

public class TwinWord {

    public static boolean isTwin(String a, String b){
        HashSet<Character> h = new HashSet<>();
        a = a.toLowerCase();
        b = b.toUpperCase();

        System.out.println(a);
        System.out.println(b);

        if(a.length() != b.length()){
            return false;
        }

        for(int i= 0; i < a.length(); i++){
            h.add(a.charAt(i));
        }

        for(int i= 0; i < b.length(); i++){
            if(!h.contains(b.charAt(i))){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isTwin("Hello", "world")); // false
        System.out.println(isTwin("acb", "bca")); // true
        System.out.println(isTwin("Lookout", "Outlook")); // true
    }
}
