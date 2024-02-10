package com.company;

import java.util.*;

public class Intersection2ArrayUsingHash {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,1,2,3,4,5,6,7};
        int [] b = {1,2,3,7};

        HashSet<Integer> h = new HashSet<>();

        for (int e : a){
            h.add(e);
        }
        int count = 0;
        for (int e : b){
            if(!h.add(e)){
                count++;
            }
        }

        System.out.println(count);
    }
}
