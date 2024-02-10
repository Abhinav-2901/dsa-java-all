package com.company;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(Arrays.asList(2), Arrays.asList(3,4), Arrays.asList(6,5,7), Arrays.asList(4,1,8,3));
//                {{2}, {3,4}, {6,5,7}, {4,1,8,3}};
        int n = triangle.size();
        int sum = triangle.get(0).get(0);
        int cur = 0;
        for(int i = 1; i < n; i++){
            List<Integer> temp = triangle.get(i);
            if(temp.get(cur) <= temp.get(cur + 1)){
                sum += temp.get(cur);
            }
            else{
                sum += temp.get(cur);
                cur++;
            }
        }

        System.out.println(sum);
    }
}
