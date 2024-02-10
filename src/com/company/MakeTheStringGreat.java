package com.company;

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        String s = "Pp";
        Stack<Character> st = new Stack<>();

        st.push(s.charAt(0));

        for(int i = 1; i < s.length();i++){
            if(s.charAt(i) <= 90){
                if(!st.empty() && s.charAt(i) + 32 == st.peek()){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else{
                if(!st.empty() && s.charAt(i) - 32 == st.peek()){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }

//        StringBuilder res = new StringBuilder();

        StringBuilder res = new StringBuilder();

        for (char c : st){
            res.append(c);
        }

        System.out.println(res);
    }
}
