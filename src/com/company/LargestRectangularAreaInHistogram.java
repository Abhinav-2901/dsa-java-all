package com.company;

public class LargestRectangularAreaInHistogram {
    public static void main(String[] args) {
        int [] height = {6, 2, 5, 4, 1, 5, 6};

        int res = 0;

        for (int i = 0; i < height.length; i++){
            int cur = height[i];
            for (int j = i-1; j >=0; j--){
                if(height[j] >= height[i]){
                    cur += height[i];
                }
                else {
                    break;
                }
            }

            for (int j = i + 1; j < height.length; j++){
                if (height[j] >= height[i]){
                    cur += height[i];
                }
                else {
                    break;
                }
            }

            res = Math.max(res,cur);
        }

        System.out.println(res);
    }
}
