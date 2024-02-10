package com.company;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {2, 10, 20, 20};
        int[] b = {3, 20, 40};
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (i > 0 && a[i - 1] == a[i]) {
                i++;
                continue;
            }
            if (j > 0 && b[i - 1] == b[i]) {
                j++;
                continue;
            }
            if (a[i] > b[j]){
                System.out.println(b[j]);
                j++;
            }
            else if(a[i] < b[j]){
                System.out.println(a[j]);
                i++;
            }
            else {
                System.out.println(a[i]);
                i++;
                j++;
            }

        }
        while (i < n1) {
            System.out.println(a[i]);
            i++;
        }
        while (j < n2) {
            System.out.println(b[j]);
            j++;
        }
    }
}
