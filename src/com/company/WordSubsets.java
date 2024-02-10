package com.company;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public static void main(String[] args) {
        String [] words1 = {"amazon","apple","facebook","google","leetcode"};
        String [] words2 = {"e", "l"};

        List<String> res = new ArrayList<>();

        int [] word2max = new int[26];
        for (String s : words2){
            int [] word2 = new int[26];
            for(int i = 0; i < s.length(); i++){
                word2[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < 26; i++){
                word2max[i] = Math.max(word2max[i],word2[i]);
            }
        }

        for (String s : words1){
            boolean flag = true;
            int [] word1 = new int[26];
            for(int i = 0; i < s.length(); i++){
                word1[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < 26; i++){
                if(word2max[i] != 0){
                    if(word1[i] < word2max[i]){
                        flag = false;
                        break;
                    }
                }
            }

            if (flag){
                res.add(s);
            }
        }

        for (String s : res){
            System.out.println(s);
        }
    }
}
