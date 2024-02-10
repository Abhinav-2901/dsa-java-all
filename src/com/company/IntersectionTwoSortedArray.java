package com.company;

public class IntersectionTwoSortedArray {
    public static void main(String[] args) {
        int [] a = {10, 20, 20, 40, 60};
        int [] b = {2,10, 20, 20, 20};
        int i = 0, j = 0;
        while (i < a.length && j < b.length){
            if(i > 0 && a[i-1] == a[i]){
                i++;
                continue;
            }
            if (a[i] > b[j]){
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }
}
