package com.company;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class PreviousGreaterElement {

    public static int[] NextGreter2Array(int [] arr1, int [] arr2){
        ArrayDeque<Integer> st = new ArrayDeque<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        int n = arr2.length;
        int [] res = new int[arr1.length];

        st.push(arr2[n-1]);
        h.put(arr2[n-1],-1);

        for (int i = n-2; i>=0; i--){
            while (!st.isEmpty() && arr2[i] > st.peek()){
                st.pop();
            }

            if (st.isEmpty()){
                h.put(arr2[i],-1);
            }
            else {
                h.put(arr2[i],st.peek());
            }

            st.push(arr2[i]);
        }

        for (int i = 0; i < arr1.length; i++){
            res[i] = h.get(arr1[i]);
        }

        return res;
    }


    public static void main(String[] args) {
        int [] arr1 = {4,1,2};
        int [] arr2 = {1,3,4,2};
        int [] res = NextGreter2Array(arr1,arr2);
//        ArrayDeque<Integer> st = new ArrayDeque<>();
//        st.push(arr[0]);
//        System.out.println(-1);
//        for (int i = 1; i < arr.length; i++){
//            while (!st.isEmpty() && arr[i] >= st.peek()){
//                st.pop();
//            }
//
//            if (st.isEmpty()){
//                System.out.println(-1);
//            }
//            else {
//                System.out.println(st.peek());
//            }
//
//            st.push(arr[i]);
//        }
    }
}
