package com.company;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 6;
        Character [][] arr = new Character[n][n];
        int count = 0;
        int top = 0, right = n - 1, bottom = n -1, left = 0;
        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++){

                arr[top][i] = (char)(count%26+97);
//                System.out.println(arr[top][i]);
                count++;

            }
            top++;
            for (int i = top; i <= bottom; i++){

                arr[i][right] = (char)(count%26+97);
//                System.out.println(arr[i][right]);
                count++;
            }
            right--;
            if (top<=bottom){
                for (int i = right; i >= left; i--){

                    arr[bottom][i] =(char)(count%26+97);
//                    System.out.println(arr[bottom][i]);
                    count++;
                }
                bottom--;
            }
            if (left<=right){
                for (int i = bottom; i >= top; i--){

                    arr[i][left] = (char)(count%26+97);
//                    System.out.println(arr[i][left]);
                    count++;
                }
                left++;
            }

        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
