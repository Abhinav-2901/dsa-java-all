package com.company;

public class CheckAnagram {

    public static Boolean anagram(String str1, String str2){

        if (str1.length()!=str2.length()){
            return false;
        }
        int [] count = new int['z' + 1];

        for (int i = 0; i < str1.length(); i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for (int j : count) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "aabbccdz";
        String str2 = "dccbbaae";
        System.out.println(anagram(str1,str2));

    }
}
