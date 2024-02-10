package com.company;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int [] arr = {10,20,30,20,30,30};

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int e : arr){
            h.put(e, h.getOrDefault(e,0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : h.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }


    }
}
