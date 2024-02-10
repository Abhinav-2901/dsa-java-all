package com.company;

import java.util.Map;
import java.util.TreeMap;

public class ValidPartition {
    public static void main(String[] args) {
        int [] nums = {4,4,4,5,6};

        TreeMap<Integer,Integer> t = new TreeMap<>();

        for (int e : nums){
            t.put(e,t.getOrDefault(e,0) + 1);
        }

        boolean valid = false;

//        for (Map.)
    }
}
