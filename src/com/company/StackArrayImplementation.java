package com.company;

import java.util.ArrayList;


class TwoStack{
    int [] arr;
    int top1;
    int top2;
    int cap;

    TwoStack(int n){
        cap = n;
        arr = new int[n];
        top1 = -1;
        top2 = cap;
    }

    void push1(int x){
        if(top1 < top2 - 1){
            top1++;
            arr[top1] = x;
        }
        else {
            System.out.println("Stack 1 full");
        }
    }

    void push2(int x){
        if(top1 < top2 - 1){
            top2--;
            arr[top2] = x;
        }
        else {
            System.out.println("Stack 2 full");
        }
    }

    int pop1(){
        if (top1 >= 0){
            int res = arr[top1];
            top1--;
            return res;
        }
        else {
            System.out.println("Stack 1 Empty");
            return 0;
        }
    }

    int pop2(){
        if(top2 < cap){
            int res = arr[top2];
            top2++;
            return res;
        }
        else {
            System.out.println("Stack 2 empty");
            return 0;
        }
    }

    int peek1(){
        return arr[top1];
    }
    int peek2(){
        return arr[top2];
    }
}

class MyStackLinkedList{
    Node head;
    int sz;

    MyStackLinkedList(){
        head = null;
        sz = 0;
    }

    int size(){
        return sz;
    }

    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }

    boolean isEmpty(){
        return (head == null);
    }

    int pop(){
        if(head == null){
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        head = head.next;
        return res;
    }

    int peek(){
        if(head == null){
            return Integer.MAX_VALUE;
        }
        int res = head.data;
        return res;
    }
}

class MyStackDynamic{
        ArrayList<Integer> st = new ArrayList<>();

        void push(int x){
            st.add(x);
        }

        int pop(){
            int res = st.get(st.size()-1);
            st.remove(st.size()-1);
            return res;
        }

        int peek(){
            int res = st.get(st.size()-1);
            return res;
        }

        int size(){
            return st.size();
        }

        boolean isEmpty(){
            return st.isEmpty();
        }
}

class Mystack{
    int[] arr;
    int cap;
    int top;


    Mystack(int c){
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    int pop(){
        int res = arr[top];
        top--;
        return res;
    }

    void push(int x){
        top++;
        arr[top] = x;
    }

    boolean isEmpty(){
        return (top == -1);
    }

    int size(){
        return top+1;
    }

    int peek(){
        return arr[top];
    }

}


public class StackArrayImplementation {

    public static void main(String[] args) {
        TwoStack st = new TwoStack(10);
        st.push1(10);
        st.push1(20);
        st.push2(30);
        st.push2(40);
        System.out.println(st.peek1());
        System.out.println(st.peek2());
    }

}
