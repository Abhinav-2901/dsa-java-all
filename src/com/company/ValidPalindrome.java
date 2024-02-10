package com.company;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = ",.";
        s=s.toLowerCase();
        int st = 0;
        int e = s.length() - 1;

        while((st < s.length() && e > 0) && st<e){
            while((st < s.length()) && (s.charAt(st) < 97 || s.charAt(st) > 122)){
                st++;
            }

            while((e >= 0) && (s.charAt(e) < 97 || s.charAt(e) > 122)){
                e--;
            }

            if((st < s.length() && e > 0) && Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(e))){
                System.out.println(false);
            }

            st++;
            e--;
        }

        System.out.println(true);
    }
}
