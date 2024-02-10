package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

class MyHash{
    int bucket;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b){
        bucket = b;
        table = new ArrayList<>();
        for (int i=0; i<b; i++)
            table.add(new LinkedList<>());
    }

    void Insert(int k){
        int i = k % bucket;
        table.get(i).add(k);
    }

    void Delete(){
        int i = 15 % bucket;
        table.get(i).remove((Integer) 15);
    }

    Boolean Search(int k){
        int i = k % bucket;
        return table.get(i).contains(k);

    }
}

public class HashingIntro {
    public static void main(String[] args) {
        MyHash mh = new MyHash(7);
        mh.Insert(10);
        mh.Insert(20);
        mh.Insert(15);
        mh.Insert(7);
        System.out.println(mh.Search(10));
        mh.Delete();
        System.out.println(mh.Search(15));
    }
}
