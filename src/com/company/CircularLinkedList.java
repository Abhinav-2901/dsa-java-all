package com.company;

class CNode{
    int data;
    CNode next;
    CNode(int x){
        data = x;
        next = null;
    }
}

public class CircularLinkedList {

    public static void PrintCLL(CNode head){
        if(head != null){
            int temp = head.data;
            while (head.next.data!=temp){
                System.out.println(head.data);
                head = head.next;
            }

            System.out.println(head.data);
        }


    }
    public static CNode InsertAtBeginning(CNode head, int x){
        CNode newNode = new CNode(x);
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }
        else {
            newNode.next = head.next;
            head.next = newNode;
            int t = head.data;
            head.data = newNode.data;
            newNode.data = t;
        }

        return head;
    }

    public static CNode InsertAtEnd(CNode head, int x){
        CNode newNode = new CNode(x);
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }
        else {
            CNode cur = head;
            while (cur.next!=head){
                cur = cur.next;
            }
            cur.next = newNode;
            newNode.next = head;
        }

        return head;
    }

    public static CNode InsertAtEndEfficient(CNode head, int x){
        CNode newNode = new CNode(x);
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }
        else {
            newNode.next = head.next;
            head.next = newNode;
            int t = head.data;
            head.data = newNode.data;
            newNode.data = t;
        }

        return newNode;
    }

    public static CNode DeleteHeadNode(CNode head){
        if (head == null || head.next == head){
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static CNode DeleteKthNode(CNode head, int k){
        if (head == null){
            return head;
        }
        if(head.next == head){
            return null;
        }
        if(k==1){
            head = DeleteHeadNode(head);
            return head;
        }

        CNode cur = head;
        for (int i = 0; i < k-2; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

    public static void main(String[] args) {
        CNode head = null;
        head = InsertAtBeginning(head,10);
        head = InsertAtBeginning(head,20);
        head = InsertAtBeginning(head,30);
        head = InsertAtEnd(head,100);
        head = InsertAtEndEfficient(head,200);
        PrintCLL(head);
        System.out.println("After deleting head");
//        head = DeleteHeadNode(head);
        head = DeleteKthNode(head, 3);
        PrintCLL(head);
    }
}
