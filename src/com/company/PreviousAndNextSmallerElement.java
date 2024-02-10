package com.company;

import java.util.ArrayDeque;

public class PreviousAndNextSmallerElement {

    public static int[] nextSmaller(int[] arr) {
        int[] res = new int[arr.length];
        int n = arr.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(n - 1);
        res[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                res[i] = n;
            } else {
                res[i] = st.peek();
            }

            st.push(i);
        }

        return res;
    }

    public static int[] previousSmaller(int[] arr) {
        int[] res = new int[arr.length];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(0);
        res[0] = -1;

        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            st.push(i);
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 1, 5, 6};

        int[] ps = previousSmaller(arr);
        int[] ns = nextSmaller(arr);

        int res = 0;

        for (int i = 0; i < arr.length; i++){
            int cur = arr[i];
            cur += (i - ps[i] - 1) * arr[i];
            cur += (ns[i] - i - 1) * arr[i];

            res = Math.max(res,cur);

        }
        System.out.println();
        System.out.println(res);
    }
}