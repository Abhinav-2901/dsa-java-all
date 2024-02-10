package com.company;

import java.util.ArrayList;
import java.util.List;

public class Four4Sum {
    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n-3; i++){
            for(int j = i+1; j < n-2; j++){
                int l = j + 1, h= n-1;
                while(l<h){
                    int sum = nums[i] + nums[j] + nums[l] + nums[h];
                    if(sum == target){
                        List <Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[l]);
                        temp.add(nums[h]);
                        res.add(temp);
                        l++; h--;
                    }
                    else if(sum < target){
                        l++;
                    }
                    else{
                        h--;
                    }
                }
            }
        }

        for(int i = 0; i < res.size(); i++){
            for (int j = 0; j < res.get(i).size(); j++){
                System.out.println(res.get(i).get(j));
            }
        }
    }
}
