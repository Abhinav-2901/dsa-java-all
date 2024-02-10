package com.company;

import java.util.HashSet;

public class Union2ArrayUsingHash {
    public static void main(String[] args) {
        int [] a = {10,20,10,30,20,40,50};
        int [] b = {40,50,70,80,60};

        HashSet<Integer> h = new HashSet<>();

        for (int e : a){
            h.add(e);
        }

        for (int e : b){
            h.add(e);
        }

        System.out.println(h.size());
    }
}
