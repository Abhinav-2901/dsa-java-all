package com.company;

public class NaivePatternSearching {


    public static void NaiveSolution(String str, String pat){
        for (int i = 0; i <= str.length() - pat.length(); i++){
            boolean flag = true;

            if(str.charAt(i) == pat.charAt(0)){
                int temp = i;
                for (int j = 1; j < pat.length(); j++){
                    if(pat.charAt(j) != str.charAt(i+j)){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    System.out.println(temp);
                }
            }
        }
    }

    public static void BetterNaiveApproach(String str, String pat){
        int n = str.length();
        int m = pat.length();

        for (int i = 0; i <= n-m;){
            int j;
            for (j =0; j < m; j++){
                if(pat.charAt(j) != str.charAt(i+j)){
                    break;
                }
            }
            if (j == m){
                System.out.println(i+" ");
            }
            if (j == 0){
                i++;
            }
            else {
                i = i+j;
            }
        }
    }
    public static void main(String[] args) {
        String str = "ABCABCD";
        String pat = "ABCD";
        NaiveSolution(str,pat);
        BetterNaiveApproach(str,pat);
    }
}
