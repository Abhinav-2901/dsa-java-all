package com.company;

import java.util.* ;

import java.lang.Math;

public class Bubble_sort {

    Bubble_sort(int n)
    {
        int min = 0 , max = 100;

        arr = new int[n];

        System.out.println("The input array is  ");

        for (int i = 0; i < n ; i++)
        {
            arr[i] = (int)(Math.random()*(max - min + 1 )+ min);
            System.out.print(" " +arr[i]);
        }
    }

    public void swap(int i ,int  j)
    {
        int temp;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public void display(int n)
    {
        System.out.println( );
        System.out.println("The Sorted array is ");
        for (int j = 0; j < n ; j++) {
            System.out.print(" " +arr[j]);
        }
    }

    private int [] arr;

    public static void main(String [] args)
    {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array ");

        int n = sc.nextInt();
        Bubble_sort bs = new Bubble_sort(n);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (bs.arr[j] > bs.arr[j + 1]) {
                    bs.swap(j + 1 , j);
                }
            }
        }
        bs.display(n);
    }
}