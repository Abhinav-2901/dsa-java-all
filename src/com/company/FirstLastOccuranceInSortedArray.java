package com.company;

public class FirstLastOccuranceInSortedArray {

    public static int firstOccurance(int [] arr, int target){

        int n = arr.length;
        int l = 0;
        int h = n-1;
        int mid = 0;
        while(l<=h){
            mid = (l+h)/2;
            if(arr[mid] > target){
                h = mid - 1;
            }
            else if(arr[mid] < target){
                l = mid + 1;
            }
            else {
                if(mid == 0 || arr[mid - 1] != arr[mid]){
                    return mid;
                }
                else {
                    h = mid - 1;
                }
            }
        }

        return -1;

    }



    public static int lastOccurance(int [] arr, int target){

        int n = arr.length;
        int l = 0;
        int h = n-1;
        int mid = 0;
        while(l<=h){
            mid = (l+h)/2;
            if(arr[mid] > target){
                h = mid - 1;
            }
            else if(arr[mid] < target){
                l = mid + 1;
            }
            else {
                if(mid == n-1 || arr[mid + 1] != arr[mid]){
                    return mid;
                }
                else {
                    l = mid + 1;
                }
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int [] arr = {5, 10, 10, 15, 20, 20, 20};
        int target = 20;
        int f = firstOccurance(arr, target);
        System.out.println(f);
        int l = lastOccurance(arr, target);
        System.out.println(l);
    }


}
