package com.company;

import java.util.PriorityQueue;

class MyPair{
    int value;
    int key;

    MyPair(int d,int i){
        value = d;
        key = i;
    }

    public Integer getKey()
    {
        return key;
    }
    public void setKey(Integer key)
    {
        this.key = key;
    }
    public Integer getValue()
    {
        return value;
    }
    public void setValue(Integer value)
    {
        this.value = value;
    }
}

public class KClosestElements {
    public static void main(String[] args) {
        int [] arr = {10,15,7,3,4};
        int x = 8;
        int k = 2;

        PriorityQueue<MyPair> pq = new PriorityQueue<>((p1, p2) -> p2.getValue().compareTo(
                p1.getValue()));

        for(int i = 0; i < k; i++){
            int abs = Math.abs(arr[i] - x);
            pq.add(new MyPair(abs,i));
        }

        for (int i = k; i < arr.length; i++){
            int abs = Math.abs(arr[i] - x);
            if(pq.peek().getValue() > abs){
                pq.poll();
                pq.add(new MyPair(abs,i));
            }
        }

        for (MyPair res: pq){
            System.out.println(arr[res.getKey()]);
        }

    }
}
