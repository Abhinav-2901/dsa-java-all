package com.company;

import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) {
        int [] arr = {5,15,20,10,8,25,18};

        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Normal way

//        for (int e : arr){
//            pq.add(e);
//        }
//
//
//        for (int i = 0; i < k; i++){
//            System.out.println(pq.poll());
//        }

        // Efficient way

        for (int i = 0; i < k; i++){
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++){
            if(pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }

        for (int i : pq){
            System.out.println(i);
        }
    }
}
