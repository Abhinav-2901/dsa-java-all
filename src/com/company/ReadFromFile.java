package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ReadFromFile {

    public static int[] Shopping(int [] shoppingList, int money){
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

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Abhinav Chauhan\\OneDrive\\Desktop\\new.txt");
        Scanner sc = new Scanner(file);
        String[] arr = sc.next().split(",");
        int [] newInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            newInt[i] = Integer.parseInt(arr[i]);
        }
//        System.out.println(newInt.length);
//        Arrays.sort(newInt);
//        for (int e : newInt){
//            System.out.println(e);
//        }

        int [] res = Shopping(newInt,55);

        for(int e : res){
            System.out.println(e);
        }
    }
}
