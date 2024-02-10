package com.company;

import java.util.*;

public class StableArray {
    public static void main(String[] args) {
        int a[] = {1,1,2,4,1,2,2};

        HashMap<Integer,Integer> h = new HashMap<>();

        for (int e : a){
            h.put(e,h.getOrDefault(e,0) + 1);
        }

//        Stack<HashMap<Integer,Integer>> st = new Stack<>();


        ArrayList<Integer> val = new ArrayList<>(h.values());

        Collections.sort(val);

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < val.size(); i++){
            int s = val.size() - i;
            int cur = s * val.get(i);
            cur = a.length - cur;
            res = Math.min(cur,res);
        }

        System.out.println(res);
    }
}
