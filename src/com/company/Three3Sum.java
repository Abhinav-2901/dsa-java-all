package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Three3Sum {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>(Collections.singletonList(new ArrayList<>()));
        for(int i = 0; i < n; i++){
            if(i==0 || i>0 && nums[i]!=nums[i-1]){
                int l = i+1;
                int h = n-1;
                while(l<h){
                    int sum = nums[i] + nums[l] + nums[h];
                    if(sum == 0){
                        if(i!=l && l!=h && h != i){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[l]);
                            temp.add(nums[h]);
                            list.add(temp);
                            while (l<h && nums[l] == nums[l+1]){
                                l++;
                            }
                            while (l<h && nums[h] == nums[h-1]){
                                h--;
                            }
                            l++; h--;
                        }
                    }
                    else if(sum > 0){
                        h--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }

        for (List<Integer> integers : list) {
            for (Integer integer : integers) {
                System.out.println(integer);
            }

        }

    }
}
