package com.company;

public class RotateMatrix90DegAnticlock {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        int r = arr.length, c = arr[0].length;




        // Naive approach

//        for (int i = 0; i < r; i++){
//            for (int j = 0; j < c; j++){
//                temp[i][j] = arr[j][r-i-1];
//            }
//        }


        // Efficient solution -  First find transpose then reverse the elements column wise


        // Transpose

        for (int i = 0; i < r; i++){
            for (int j = i+1; j < c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }



        for (int i = 0; i < c; i++){
            int l = 0, h = r-1;
            while (l < h){
                int s = arr[l][i];
                arr[l][i] = arr[h][i];
                arr[h][i] = s;
                l++; h--;
            }
        }

        for (int [] e : arr){
            for (int el : e){
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
