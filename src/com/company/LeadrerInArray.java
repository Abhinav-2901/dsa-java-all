package com.company;

public class LeadrerInArray {
    public static void main(String[] args) {
        int [] arr  = {7,10,4,10,6,5,2};


        // Naive solution

//        for (int i = 0; i < arr.length; i++){
//            Boolean status = true;
//            for(int j = i; j < arr.length-1; j++){
//                if(arr[i] <= arr[j+1]){
//                    status = false;
//                    break;
//                }
//            }
//            if (status){ 
//                System.out.println(arr[i]);
//            }
//        }



        // Efficient solution

        int curr_led = arr[arr.length-1];
        System.out.println(curr_led);
        for(int i = arr[arr.length-2]; i>=0 ; i--){
            if(curr_led < arr[i]){
                curr_led = arr[i];
                System.out.println(curr_led);
            }
        }
    }
}
