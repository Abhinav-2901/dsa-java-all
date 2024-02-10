package com.company;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        int r = arr.length, c = arr[0].length;

        // Naive solution

//        int [][] tm = new int[r][c];
//
//        for (int i = 0; i < r; i++){
//            for (int j = 0; j < c; j++){
//                tm[j][i] = arr[i][j];
//            }
//        }


        // Efficient solution

        for (int i = 0; i < r; i++){
            for (int j = i+1; j < c; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int [] e : arr){
            for (int el : e){
                System.out.print(el);
            }
            System.out.println();
        }
    }
}
