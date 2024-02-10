package com.company;

import java.util.HashMap;
import java.util.Map;

public class PokerHand {
    public static void main(String[] args) {

        String res = "";

        HashMap<Integer,Integer> rank= new HashMap<>();
        HashMap<Character,Integer> suit= new HashMap<>();

        int [] ranks = {13,2,3,1,9};
        char [] suits = {'a', 'a', 'a', 'a', 'a', 'a'};

        for (int e : ranks){
            rank.put(e,rank.getOrDefault(e, 0) + 1);
        }

        for (char e : suits){
            suit.put(e,suit.getOrDefault(e, 0) + 1);
        }

        if(suit.size() == 1){
            res = "Flush";
        }

        for (Map.Entry<Integer, Integer> e : rank.entrySet()){
            if(e.getValue() >= 3){
                res = "Three of a Kind";
            }
            if (e.getValue() == 2){
                res = "Pair";
            }
        }

        if(res.length() == 0){
            res = "High card";
        }

        System.out.println(res);
    }
}
