package com.company;

public class ReverseWords {
    public static void main(String[] args) {

        String s = "Abhinav is a good boy";
        String [] arr = s.split(" ");
        String res = "";
        for(String st : arr){
            char [] str = st.toCharArray();
            int b = 0;
            int e = st.length() - 1;
            while(b<e){
                char temp = str[b];
                str[b] = str[e];
                str[e] = temp;
                b++;
                e--;
            }
            String rev = String.valueOf(str);
            res = res + rev + " ";
        }
        System.out.println(res);
    }
}
