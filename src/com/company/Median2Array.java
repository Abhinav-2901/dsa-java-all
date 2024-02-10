package com.company;

public class Median2Array {
    public static void main(String[] args) {
        int [] arr1 = {2,2,4,4};
        int [] arr2 = {2,2,4,4};
        int n = arr1.length;
        int m = arr2.length;
        int [] newarr = new int[m+n];
        int i1 = 0;
        int i2 = 0;
        int c = 0;
        while (c < m+n){
            if(i1 < arr1.length && i2 < arr2.length){
                if(arr1[i1] <= arr2[i2]){
                    newarr[c] = arr1[i1];
                    i1++;
                }
                else  if(arr1[i1] > arr2[i2]){
                    newarr[c] = arr2[i2];
                    i2++;
                }
            }
            else if(i1 == arr1.length){
                newarr[c] = arr2[i2];
                i2++;
            }
            else if (i2 == arr2.length){
                newarr[c] = arr1[i1];
                i1++;
            }
            c++;

        }
        for ( int e : newarr){
            System.out.println(e);
        }

        double med = 0;

        if(newarr.length % 2 == 0){
            med = (newarr[(m+n) / 2] + newarr[(m+n) / 2 -1]) / 2.0F;
            System.out.println(med);
        }
        else {
            med = newarr[Math.floorDiv(m+n, 2)];
            System.out.println(med);
        }
    }
}
