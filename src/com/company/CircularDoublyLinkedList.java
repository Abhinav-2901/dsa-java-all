package com.company;

class CDNode{
    int data;
    CDNode next;
    CDNode prev;
    CDNode(int x){
        data = x;
        next = null;
        prev = null;
    }
}

public class CircularDoublyLinkedList {

    public static void PrintCDLL(CDNode head){
        if (head == null){
            return;
        }
        CDNode cur = head;
        while (cur.next != head){
            System.out.println(cur.data);
            cur = cur.next;
        }
        System.out.println(cur.data);
    }

    public static CDNode InsertAtBeginning(CDNode head, int x){
        CDNode newNode = new CDNode(x);
        if(head == null){
            newNode.next = newNode;
            newNode.prev = newNode;
            return newNode;
        }


        newNode.prev = head.prev;
        newNode.next = head;
        head.prev.next = newNode;
        head.prev = newNode;

        return newNode;
    }

    public static CDNode InsertAtEnd(CDNode head, int x){
        CDNode newNode = new CDNode(x);
        if(head == null){
            newNode.next = newNode;
            newNode.prev = newNode;
            return newNode;
        }


        newNode.prev = head.prev;
        newNode.next = head;
        head.prev.next = newNode;
        head.prev = newNode;

        return head;
    }
    public static void main(String[] args) {
        CDNode head = null;
        head = InsertAtBeginning(head, 10);
        head = InsertAtBeginning(head, 20);
        head = InsertAtBeginning(head, 30);
        PrintCDLL(head);
        head = InsertAtEnd(head,100);
        PrintCDLL(head);

    }
}
