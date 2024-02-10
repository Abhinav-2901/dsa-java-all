package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Random {

    public static int[] Shopping(int[] shoppingList, int money){
        int [] res = new int[2];
        int n = shoppingList.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i< n; i++){
            if (h.containsKey(money-shoppingList[i])){
                res[1] = i;
                res[0] = h.get(money-shoppingList[i]);
                break;
            }
            h.put(shoppingList[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = new int[100000];
        HashSet<Integer> h = new HashSet<>();
        while (h.size() < 100000){
            int randomNum = 1 + (int)(Math.random() * 999999);
            h.add(randomNum);
        }

//        System.out.println(h.size());
        int count = 0;
        for(Integer e : h){
            arr[count] = e;
            count++;
            System.out.print(e + ",");
        }

//        for (int e : arr){
//            System.out.println(e);
//        }

        int [] res = Shopping(arr, 2157);
//        System.out.println(res[0]+ "-----" +res[1]);
    }
}
