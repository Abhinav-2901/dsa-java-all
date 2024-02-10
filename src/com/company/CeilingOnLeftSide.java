package com.company;

import java.util.TreeSet;

public class CeilingOnLeftSide {
    public static void main(String[] args) {
        int [] arr = {2,8,30,15,25,12};

        System.out.println(-1);

        TreeSet<Integer> t = new TreeSet<>();

        t.add(arr[0]);

        for (int i = 1; i < arr.length; i++){
            if (t.ceiling(arr[i]) != null){
                System.out.println(t.ceiling(arr[i]));
            }
            else {
                System.out.println(-1);
            }

            t.add(arr[i]);
        }
    }
}
