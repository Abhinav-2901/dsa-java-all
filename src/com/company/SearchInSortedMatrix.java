package com.company;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
//        int [][] arr = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20},{21,22,23,24,25}};
//        int [][] arr = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int [][] arr = {{1}};
        int elem = 1;
        int r = arr.length, c = arr[0].length;

        int i = 0, j = c-1;
        while (i<r && j>=0){
//            System.out.println(arr[i][j]);
            if (arr[i][j] == elem){
                System.out.println(arr[i][j]+i+j);
                break;
            }
            else if(arr[i][j] > elem){
                j--;
            }
            else {
                i++;
            }
        }
    }
}
