package com.company;

public class countAstrics {
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        Boolean iscount = true;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*' && iscount == true){
                count++;
            }
            if(s.charAt(i) == '|'){
                if(iscount == true){
                    iscount = false;
                }
                else {
                    iscount = true;
                }
            }
        }

        System.out.println(count);
    }
}
