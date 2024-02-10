package com.company;

import java.util.HashSet;

public class UniqueMooseCode {
    public static void main(String[] args) {
        String [] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


        String [] words = {"gin","zen","gig","msg"};

        HashSet<String> h = new HashSet<>();

        for (String word : words){
            StringBuilder curWordCode = new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                curWordCode.append(codes[word.charAt(i) - 'a']);
            }

            h.add(String.valueOf(curWordCode));
        }

        System.out.println(h.size());
    }
}
