package com.company;

public class PalindroneCheckString {
    public static void main(String[] args) {
        String str = "abcdcba";


//        String res = "";
//        for (int i = str.length() -1; i>=0; i--){
//            res = res + str.charAt(i);
//        }
//
//        if(str.equals(res)){
//            System.out.println("Palindrone");
//        }
//        else {
//            System.out.println("Not Palindrone");
//        }


        // Efficient Solution

        int i = 0;
        Boolean status = true;
        int j = str.length()-1;
        while (i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else {
                status = false;
                break;
            }
        }

        if (status){
            System.out.println("Palindrone");
        }
        else {
            System.out.println("Not Palindrone");
        }
    }
}
