package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        int [] arr = {30, 40, 10, 80, 5, 12, 70};
        int k = 4;
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++){
            max = Math.max(arr[i], max);
        }
        max++;

        ArrayList<ArrayList<Integer>> bkt = new ArrayList<>();
        for (int i = 0; i < k; i++){
            bkt.add(new ArrayList<>());
        }

        for (int j : arr) {
            int bi = (k * j) / max;
            bkt.get(bi).add(j);
        }

        for (int i = 0; i< k; i++){
            Collections.sort(bkt.get(i));
        }

        int index = 0;
        for (int i = 0; i< k; i++){
            for (int j = 0; j< bkt.get(i).size(); j++){
                arr[index++] = bkt.get(i).get(j);
            }
        }

        for (int e : arr){
            System.out.println(e);
        }
    }
}
