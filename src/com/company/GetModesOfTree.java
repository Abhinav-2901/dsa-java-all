package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class GetModesOfTree {

    public static void inorder(TreeNode root, HashMap<Integer,Integer> h){
        if(root != null){
            h.put(root.key,h.getOrDefault(root.key, 0) + 1);
            inorder(root.left,h);
            inorder(root.right,h);
        }
    }

    public static int[] findMode(TreeNode root) {


        HashMap<Integer,Integer> h = new HashMap<>();

        inorder(root,h);


        ArrayList<Integer> temp = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(Integer i : h.values()){
            if(max < i){
                max = i;
            }
        }

        for(HashMap.Entry<Integer,Integer> e : h.entrySet()){
            if(e.getValue() == max){
                temp.add(e.getKey());
            }
        }


        int [] res = new int[temp.size()];

        for(int i = 0; i < temp.size(); i++){
            res[i] = temp.get(i);
        }

        return res;
    }

    public static void main(String[] args) {

        TreeNode bt = new TreeNode(-4);
        bt.left = new TreeNode(-5);
        bt.right = new TreeNode(-4);
        int [] res = findMode(bt);

        for (int e : res){
            System.out.println(e);
        }
    }
}
