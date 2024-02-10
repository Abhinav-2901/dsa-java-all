package com.company;

public class ReverseWordsInAString {

    public static void NaiveSolution(String str){
        String [] temp = str.split(" ");
        for (int i= temp.length-1; i>=0; i--){
            System.out.print(temp[i]+" ");
        }
    }

    public static void SolutionWithoutExtraSpace(String str){
        int temp = str.length();
        StringBuilder s = new StringBuilder(str);
        for (int i = str.length()-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                System.out.print(str.substring(i+1, temp) + " ");
                temp = i;
            }
        }
        System.out.print(str.substring(0,temp));
    }

    public static void reverse(char [] str1, int start, int end){
        while (start <= end){
            char temp = str1[start];
            str1[start] = str1[end];
            str1[end] = temp;
            start++;
            end--;
        }
    }

    public static void EfficientSolution(char [] str1){
        int start = 0;
        for (int end = 0; end < str1.length; end++){
            if (str1[end] == ' '){
                reverse(str1, start,end-1);
                start = end + 1;
            }
        }
        reverse(str1, start, str1.length -1 );
        reverse(str1, 0, str1.length-1);
    }

    public static void main(String[] args) {
        String str = "Coding is my life okay";
        char [] str1 = str.toCharArray();
//        NaiveSolution(str);
//        SolutionWithoutExtraSpace(str);
        EfficientSolution(str1);
        for (char e : str1){
            System.out.print(e);
        }
    }
}
