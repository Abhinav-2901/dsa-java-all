package com.company;

class A{
    int n;
    String name;
    A(int num, String Name){
        n = num;
        name = Name;
    }
    A(){

    }
    A(int num){
        n = num;
    }
    public void Display(){
        System.out.println("Display of A");
        System.out.println(n);
        System.out.println(name);
    }
}

class B extends A{
    int n;
    String name;

    public void Display(){
        System.out.println("Display of B");
        System.out.println(n);
        System.out.println(name);
    }
}

public class IamBack {

    private int [] temp;

    public static void main(String[] args) {

        IamBack go = new IamBack();
        go.temp = new int[10];
//        A a2 = new A(10,"Abhinav");
//        A a1 = new A(10);
//        A a3 = new A();
//        a1.Display();
//        a2.Display();
//        a3.Display();
        B bb = new B();
        A ab = new B();
        A aa = new A();
        aa.Display();
        bb.Display();
        ab.Display();

        int [] arr = new int[10];
        int min = 20;
        int max = 40;

        for (int i = 0; i < 10; i++){
            arr[i] = (int) (Math.random() * (max-min + 1) + min);
        }
    }
}
