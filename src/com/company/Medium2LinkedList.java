/* PROBLEM NAME: Break the ring for Rosy

PROBLEM STATEMENT: There are children standing holding hand of child. Each child is wearing a shirt having a number on its back.
There may be possibility that last children is holding some other children of the chain which may for a ring.
Your task is to help Rosy to break the ring and make her hold the hand of last person.
Here each child is represented by a node of linked list and hand represents the pointer or reference to other child.
You are given the access of the first child who is the head of linked list.
There are cases:
No child is present, in that case Rosy will be the head.
Only one child is present who is holding is own hand which is considered as ring or is hand is free which is not a ring.


INPUT FORMAT:
First line contains head of linked list
Second line contain integer which represents number on Rosy's t-shirt.

OUTPUT FORMAT:
Return the head of Linked list after adding Rosy at the end of chain of children.

SAMPLE INPUT:
Node head
5

1 -> 2-> 3-> 4->
     |         |
     <-<-<-<-<-|
Here the loop is forming from 4 -> 2

SAMPLE OUTPUT
Node head
After removal of loop
1->2->3->4->5
*/


package com.company;
class LinkNode{
    int data;
    LinkNode next;
    LinkNode(int x){
        data = x;
        next = null;
    }
}

public class Medium2LinkedList {

    public static void PrintList(LinkNode head){
        LinkNode cur = head;
        while (cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }


    public static LinkNode InsertAtBeginning(LinkNode head, int x) {
        LinkNode newHead = new LinkNode(x);
        newHead.next = head;
        return newHead;
    }

    public static LinkNode InsertAtEnd(LinkNode head, int x){
        LinkNode newNode = new LinkNode(x);
        if(head == null){
            return newNode;
        }

        LinkNode cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
        return head;
    }

    public static LinkNode findAndRemoveLoop(LinkNode head, int x){
        LinkNode Rosy = new LinkNode(x);
        LinkNode slow = head;
        LinkNode fast = head;
        if(head == null){
            return Rosy;
        }
        if(head.next == null){
            head.next = Rosy;
            return head;
        }
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        if(slow != fast){
            LinkNode cur = head;
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = Rosy;
            return head;
        }
        slow = head;
        if(slow == fast){
            LinkNode cur = head;
            while (cur.next != head){
                cur = cur.next;
            }
            cur.next = Rosy;
            return head;
        }
        while(slow.next!=fast.next){
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = Rosy;
        return head;
    }

    public static void main(String[] args) {

        // Test case 1

//        LinkNode head1 = null;
//        head1 = findAndRemoveLoop(head1,100);
//        PrintList(head1);

//         Test case 2

//        LinkNode head2 = new LinkNode(10);
//        head2.next = head2;
//        head2 = findAndRemoveLoop(head2,100);
//        PrintList(head2);
//
        //Test case 3

//        LinkNode head3 = new LinkNode(10);
//        head3 = InsertAtEnd(head3,20);
//        head3 = InsertAtEnd(head3,30);
//        head3.next.next.next =head3;
//        head3 = findAndRemoveLoop(head3,100);
//        PrintList(head3);
//
        //Test case 4

//        LinkNode head4 = new LinkNode(10);
//        head4 = InsertAtEnd(head4,20);
//        head4 = InsertAtEnd(head4,30);
//        head4 = InsertAtEnd(head4,40);
//        head4.next.next.next.next = head4.next;
//        head4 = findAndRemoveLoop(head4, 100);
//        PrintList(head4);

        //Test case 5

//        LinkNode head5 = new LinkNode(10);
//        head5 = findAndRemoveLoop(head5,100);
//        PrintList(head5);
    }
}
