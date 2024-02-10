package com.company;

class QueueLinkedList{
    Node front,rear;
    int size;

    QueueLinkedList(){
        front = null;
        rear = null ;
        size = 0;
    }

    int getFront(){
        if(size == 0){
            return -1;
        }
        return front.data;
    }

    int getRear(){
        if (size == 0){
            return -1;
        }

        return rear.data;
    }

    void Enque(int x){
        Node temp = new Node(x);
        if (front == null && rear == null){
            rear = temp;
            front = temp;
        }
        else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    void Deque(){
        if (size == 0){
            System.out.println("Queue Empty!");
        }
        else{
            front = front.next;
        }

        size--;
    }
}

class QueueArray{
    int front, size, cap;
    int [] arr;

    QueueArray(int c){
        arr = new int[c];
        front = 0;
        size = 0;
        cap = c;
    }

    Boolean isEmpty(){
        return (size == 0);
    }

    Boolean isFull(){
        return (size == cap);
    }

    int getFront(){
        if (isEmpty()){
            return -1;
        }
        else {
            return front;
        }
    }

    int getRear(){
        if (isEmpty()){
            return -1;
        }
        else {
            return (front + size - 1) % cap;
        }
    }

    void Enque(int x){
        if (isFull()){
            System.out.println("Queue is full!");
        }
        else {
            int rear = getRear();
            rear = (rear + 1) % cap;
            arr[rear] = x;
            size++;
        }
    }

    void Deque(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
        }
        else {
            front = (front + 1) % cap;
            size--;
        }
    }
}

public class Queue<I extends Number> {
    public static void main(String[] args) {
//        QueueArray qA = new QueueArray(50);
        QueueLinkedList qA = new QueueLinkedList();
        qA.Enque(10);
        qA.Enque(20);
        qA.Enque(30);
        System.out.println(qA.getFront());
        System.out.println(qA.getRear());
        qA.Deque();
        qA.Deque();
        qA.Deque();
        System.out.println(qA.getFront());
        System.out.println(qA.getRear());

    }
}
