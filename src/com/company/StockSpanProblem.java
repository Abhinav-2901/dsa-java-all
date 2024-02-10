package com.company;

import java.util.ArrayDeque;

public class StockSpanProblem {
    public static void main(String[] args) {
        int [] arr = {60, 10, 20, 15, 35, 50};

        ArrayDeque<Integer> st = new ArrayDeque<>();

        st.push(0);
        System.out.println(1);

        for (int i = 1; i < arr.length; i++){
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }

            int span;
            if(st.isEmpty()){
                span = i + 1;
            }
            else {
                span = i - st.peek();
            }

            st.push(i);

            System.out.println(span);
        }
    }
}
