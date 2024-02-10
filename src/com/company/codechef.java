

import java.util.Scanner;

class codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            int X = Integer.parseInt(arr[0]);
            int Y = Integer.parseInt(arr[1]);
            if (X / 2 > Y) {
                System.out.println(Y);
            } else {
                System.out.println(X / 2);
            }
        }
    }
}
