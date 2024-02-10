package com.company;

import java.util.Queue;
import java.util.LinkedList;
import java.util.TreeSet;

public class GenerateNumberWithGivenDigits {
    public static void main(String[] args) {

        int n = 100;
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        q.offer("2");
        q.offer("3");
        q.offer("4");
        q.offer("5");
        q.offer("6");
        q.offer("7");
        q.offer("8");
        q.offer("9");

        for (int i = 0; i < n; i++){
            String cur = q.poll();
            System.out.println(cur);
            q.offer(cur+ "0");
            q.offer(cur+ "1");
            q.offer(cur+ "2");
            q.offer(cur+ "3");
            q.offer(cur+ "4");
            q.offer(cur+ "5");
            q.offer(cur+ "6");
            q.offer(cur+ "7");
            q.offer(cur+ "8");
            q.offer(cur+ "9");
        }
    }
}
