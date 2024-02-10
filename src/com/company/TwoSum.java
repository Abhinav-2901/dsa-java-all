/* PROBLEM NAME: Two Sum
CHALLENGE DESCRIPTION:
PROBLEM STATEMENT:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

INPUT FORMAT:
First line contains integer array
Second line contains target sum

OUTPUT FORMAT:
Integer array having indices of two numbers

SAMPLE INPUT:

[2,7,11,15]
9

SAMPLE OUTPUT:
[0,1]

EXPLANATION:
Because nums[0] + nums[1] == 9, we return [0, 1]

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */

package com.company;

import java.util.HashMap;

public class TwoSum {


    public static int [] TwoSumNSolution(int[] nums, int target){
        int [] res = new int[2];
        int n = nums.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i< n; i++){
            if (h.containsKey(target-nums[i])){
                res[1] = i;
                res[0] = h.get(target-nums[i]);
                break;
            }
            h.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int [] res = TwoSumNSolution(nums,target);
        for(int e : res){
            System.out.println(e);
        }
    }
}
