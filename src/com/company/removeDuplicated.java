package com.company;

import java.util.Stack;

public class removeDuplicated {
    public static void main(String[] args) {
        String s = "azxxzy";

        Stack<Character> st = new Stack<>();

        st.push(s.charAt(0));


        for (int i = 1; i < s.length(); i++){
            if(!st.isEmpty() && s.charAt(i) == st.peek()){
                st.pop();
            }
            else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder res = new StringBuilder();

        for (char c : st){
            res.append(c);
        }

        System.out.println(res);
    }
}
