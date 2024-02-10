package com.company;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {
    public static void main(String[] args) {

        int [] nums = {2,2,3,2};
        HashMap<Integer,Integer> h = new HashMap<>();

        int x = 0;

        int res = 0;

        for(int e : nums){
            h.put(e, h.getOrDefault(x,0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : h.entrySet()){
            if(e.getValue() == 1){
                res = e.getKey();
                break;
            }
        }

        System.out.println(res);
    }
}
