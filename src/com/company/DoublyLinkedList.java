package com.company;

class DNode{
    int data;
    DNode next;
    DNode prev;
    DNode(int x){
        data = x;
        next = null;
        prev = null;
    }
}

public class DoublyLinkedList {

    public static void PrintDDL(DNode head){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static DNode InsertAtBeginning(DNode head, int x){

        DNode newNode = new DNode(x);
        if(head == null){
            return newNode;
        }

        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }


    public static DNode InsertAtEnd(DNode head, int x){
        DNode newNode = new DNode(x);
        if(head == null){
            return newNode;
        }

        DNode cur = head;
        while (cur.next != null){
            cur = cur.next;
        }

        cur.next = newNode;
        newNode.prev = cur;

        return head;
    }


    public static DNode ReverseDDL(DNode head){
        if(head == null || head.next == null){
            return head;
        }

        DNode prev = null;
        DNode cur = head;

        while (cur != null){
            prev = cur.prev;
            cur.prev = cur.next;
            cur.next = prev;
            cur = cur.prev;
        }

        return prev.prev;
    }

    public static DNode DeleteHeadNode(DNode head){
        if(head == null || head.next == null){
            return null;
        }
        head.next.prev = null;
        head = head.next;
        return head;
    }

    public static DNode DeleteLastNode(DNode head){
        if(head == null || head.next == null){
            return null;
        }

        DNode cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.prev.next = null;

        return head;
    }


    public static void main(String[] args) {
        DNode head = new DNode(10);
        head = InsertAtBeginning(head,20);
        head = InsertAtBeginning(head,30);
        head = InsertAtBeginning(head,40);
        head = InsertAtEnd(head,100);
        PrintDDL(head);
        head = ReverseDDL(head);
        PrintDDL(head);
        head = DeleteHeadNode(head);
        PrintDDL(head);
        head = DeleteLastNode(head);
        PrintDDL(head);
    }
}
