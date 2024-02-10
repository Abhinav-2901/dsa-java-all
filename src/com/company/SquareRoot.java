package com.company;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 48;
        int l = 1;
        int h = x;
        int ans = -1;
        int mid = 0;
        int msqr = 0;
        while (l <= h){
            mid = (l + h)/2;
            msqr = mid * mid;
            if(msqr == x){
                System.out.println(mid);
                break;
            }
            else if (msqr > x){
                h = mid - 1;
            }
            else {
                l = mid + 1;
                ans = mid;
            }
        }
        System.out.println(ans);
    }
}
