package com.company;

import java.util.ArrayList;
import java.util.List;

public class RemoveComments {
    public static void main(String[] args) {

        List<String> res = new ArrayList<>();
        String [] source = {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"};
        for(int i = 0; i< source.length; i++){
            if(source[i].contains("/*")){
                for(int j = i; j < source.length; j++){
                    if (source[j].contains("*/")){
                        i = j +1;
                        break;
                    }
                }
            }
            if(source[i].contains("//")){
                res.add(" ");
            }
            else {
                res.add(source[i]);
            }
        }

        for (String s : res){
            System.out.println(s);
        }

    }
}
