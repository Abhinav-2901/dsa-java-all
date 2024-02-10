package com.company;

import java.util.Map;
import java.util.TreeMap;

public class NumberContainerSystem {

    static TreeMap<Integer,Integer> h = new TreeMap<>();

    public static void change(int index, int number){
        if(h.containsKey(index)){
            h.replace(index,number);
        }
        else {
            h.put(index,number);
        }
    }

    public static int find(int number){
        for (Map.Entry<Integer, Integer> e : h.entrySet()){
            if (e.getValue() == number){
                return e.getKey();
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        System.out.println(find(10));

        change(2,10);
        change(1,10);
        change(3,10);
        change(5,10);
        System.out.println(find(10));
        change(1,20);
        System.out.println(find(10));
    }
}
