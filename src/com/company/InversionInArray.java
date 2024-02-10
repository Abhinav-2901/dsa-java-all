package com.company;

public class InversionInArray {
    public static int MergeSort(int [] arr, int l, int r){
        int res = 0;
        if(r > l){
            int m = l + (r - l)/2;
            res += MergeSort(arr, l, m);
            res += MergeSort(arr, m+1, r);
            res += Merge(arr, l, m, r);
        }
        return res;
    }


    public static int Merge(int [] arr, int l, int m, int r){
        int n1 = m - l +1;
        int n2 = r - m;
        int [] left = new int[n1];
        int [] right = new int[n2];

        for(int i = 0; i < n1; i++){
            left[i] = arr[l + i];
        }
        for(int i = 0; i < n2; i++){
            right[i] = arr[m + 1 + i];
        }
        int i = 0, j= 0, k = l, res = 0;
        while (i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++; k++;
            }
            else {
                res = res + (n1 - i);
                arr[k] = right[j];
                j++; k++;
            }
        }
        while (i < n1){
            arr[k] = left[i];
            i++; k++;
        }
        while (j < n2){
            arr[k] = right[j];
            j++; k++;
        }

    return res;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,1,3,5};
        int n = arr.length;

        // Naive Solution
//        int count = 0;
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                if(arr[i] > arr[j]){
//                    System.out.println(arr[i]+","+arr[j]);
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

        //Efficient solution
        int res = 0;
        res = MergeSort(arr, 0, n-1);
        System.out.println(res);

    }
}
