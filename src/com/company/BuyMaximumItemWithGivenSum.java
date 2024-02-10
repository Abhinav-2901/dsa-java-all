package com.company;

import java.util.PriorityQueue;

public class BuyMaximumItemWithGivenSum {
    public static void main(String[] args) {
        int [] arr = {1, 12, 5, 111, 200};
        int sum = 10;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int e : arr){
            pq.add(e);
        }

        int res = 0;
        for(int i = 0; i< pq.size(); i++){
            if(pq.peek() < sum){
                sum -= pq.poll();
                res++;
            }
            else {
                break;
            }
        }

        System.out.println(res);
    }
}
