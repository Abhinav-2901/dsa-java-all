package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Two2Sum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int n = nums.length;
        int [] res = new int[2];

        // Using Hashset
//        HashSet<Integer> h = new HashSet<>();
//        for (int i = 0; i<n; i++){
//            if(h.contains(target-nums[i])){
//                res[0] = i;
//            }
//            else{
//                h.add(nums[i]);
//            }
//        }
//
//        for (int e = 0; e < n; e++){
//            if (e != res[0] && nums[e] == target - nums[res[0]]){
//                res[1] = e;
//                break;
//            }
//        }

        // Using Hashmap

        HashMap<Integer,Integer> h = new HashMap<>();

        for (int i = 0; i< n; i++){
            if (h.containsKey(target-nums[i])){
                res[1] = i;
                res[0] = h.get(target-nums[i]);
                break;
            }
            h.put(nums[i],i);
        }

        for (int e : res){
            System.out.println(e);
        }
    }
}
