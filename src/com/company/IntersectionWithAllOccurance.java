package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionWithAllOccurance {
    public static void main(String[] args) {

        int [] nums1 = {1,2,2,1};
        int [] nums2 = {3,2,2,1};


        HashMap<Integer,Integer> h = new HashMap<>();
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int e : nums1){
            h.put(e, h.getOrDefault(e,0) + 1);
        }

        for(int e: nums2){
            if(h.containsKey(e)){
                res.put(e,h.get(e) + 1);
            }
        }

        List<Integer> temp = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : h.entrySet()){
            int size = e.getValue();
            for(int i = 0; i < size; i++){
                temp.add(e.getKey());
            }
        }

        int [] ret = new int[temp.size()];

        int count = 0;
        for(Integer e : temp){
            ret[count] = e;
            count++;
        }
    }
}
