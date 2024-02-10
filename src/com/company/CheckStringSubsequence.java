package com.company;

public class CheckStringSubsequence {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String sub = "gkfoksa";

        int i = 0;
        int j = 0;

        while (i < sub.length() && j < str.length()){
            if(str.charAt(j) == sub.charAt(i)){
                i++;
            }
            j++;
        }
        if(i == sub.length()){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
