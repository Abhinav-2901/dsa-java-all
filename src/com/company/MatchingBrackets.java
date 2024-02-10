package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class MatchingBrackets {

    public static boolean matching(char a, char b){
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }

    public static Boolean checkMatching(String str){
        Deque<Character> s = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                s.push(str.charAt(i));
            }

            else {
                if(s.isEmpty()){
                    return false;
                }
                else if(!matching(s.peek(), str.charAt(i))){
                    return false;
                }
                else {
                    s.pop();
                }
            }
        }
        return(s.isEmpty());
    }

    public static void main(String[] args) {
        String str = "{([({{}})])}";
        System.out.println(checkMatching(str));
    }
}
