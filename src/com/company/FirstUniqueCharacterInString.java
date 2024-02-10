package com.company;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "loveleetcode";

        HashMap<Character,Integer> h = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
//            System.out.println(s.charAt(i));
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++){
            if(h.get(s.charAt(i)) == 1){
                System.out.println(i + "     " + s.charAt(i));
                break;
            }
        }




//        for (Map.Entry<Character,Integer> e : h.entrySet()){
//            System.out.println(e.getKey() + "    " + e.getValue());
//        }

    }
}
