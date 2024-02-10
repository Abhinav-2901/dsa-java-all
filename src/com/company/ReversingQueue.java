package com.company;

import java.lang.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReversingQueue{

    public static Queue<Integer> Reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }

        while (!s.isEmpty()){
            q.offer(s.pop());
        }

        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        System.out.println(Reverse(q));

    }
}
