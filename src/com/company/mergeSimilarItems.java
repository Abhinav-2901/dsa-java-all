package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class mergeSimilarItems {
    public static void main(String[] args) {
        int [][] items1 = {{1,2},{4,5},{3,8}};
        int [][] items2 = {{3,1},{1,5}};

        TreeMap<Integer,Integer> t = new TreeMap<>();

        for(int i = 0; i < items1.length; i++){
            t.put(items1[i][0],items1[i][1]);
        }

        for(int i = 0; i < items2.length; i++){
            t.put(items2[i][0],t.get(items2[i][0]) + items2[i][1]);
        }

        List<List<Integer>> res = new ArrayList<>();

        for(Map.Entry<Integer,Integer> e : t.entrySet()){
            List<Integer> temp = new ArrayList<>();
            temp.add(e.getKey());
            temp.add(e.getValue());
            res.add(temp);
        }

        for (List<Integer> e : res){
            for (Integer i : e){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
