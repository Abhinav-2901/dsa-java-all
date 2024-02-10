package com.company;

import java.util.ArrayDeque;

public class balancedParanthesis {

    public static Boolean matching(char a, char b){
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }

    public static Boolean isBalancedParenthesis(String s){
        ArrayDeque<Character> st = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c =='(' || c == '{' || c == '['){
                st.push(c);
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                else if(!matching(st.peek(), c)){
                    return false;
                }
                else {
                    st.pop();
                }
            }
        }

        return (st.isEmpty());
    }

    public static void main(String[] args) {
        String s = "(([{(}]))";
        System.out.println(isBalancedParenthesis(s));
    }
}
