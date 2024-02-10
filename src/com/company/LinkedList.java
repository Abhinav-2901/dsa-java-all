package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class LinkedList {

    public static void PrintList(Node head){
        Node cur = head;
        while (cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    public static void PrintListRecursive(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.data);
        PrintListRecursive(head.next);
    }

    public static Node InsertAtBeginning(Node head, int x){
        Node newHead = new Node(x);
        newHead.next = head;
        return newHead;
    }

    public static Node InsertAtEnd(Node head, int x){
        Node newNode = new Node(x);
        if(head == null){
            return newNode;
        }

        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
        return head;
    }

    public static Node DeleteFirstNode(Node head){
        if(head == null){
            return null;
        }
        else {
            return head.next;
        }
    }

    public static Node DeleteLastNode(Node head){
        if (head == null){
            return null;
        }
        if (head.next == null){
            return null;
        }

        Node cur = head;
        while (cur.next.next!=null){
            cur = cur.next;
        }

        cur.next = null;
        return head;


    }

    public static Node InsertAtPosition(Node head, int x, int pos){
        Node newNode = new Node(x);
        if (pos == 1){
            newNode.next = head;
            return newNode;
        }
        Node cur = head;
        for (int i= 1; i< pos-2 && cur!=null; i++){
            cur = cur.next;
        }

        if (cur == null){
            return head;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        return head;
    }

    public static int SearchInLinearWay(Node head, int elem){
        Node cur = head;
        int count = 1;
        while (cur != null){
            if(cur.data == elem){
                return count;
            }
            else {
                count++;
                cur = cur.next;
            }
        }

        return -1;
    }

    public static int SearchInRecursiveWay(Node head, int x){
        if (head == null){
            return -1;
        }
        if(head.data == x){
            return 1;
        }
        else {
            int res = SearchInRecursiveWay(head.next, x);
            if (res == -1){
                return -1;
            }
            else return (res + 1);
        }
    }

    public static Node InsertAtSortedPosition(Node head, int x){
        Node newNode = new Node(x);
        if (head == null){
            return newNode;
        }

        if(x < head.data){
            newNode.next = head;
            return newNode;
        }
        Node cur = head;
        while (cur.next!=null && cur.next.data < x){
            cur = cur.next;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        return head;

    }

    public static void PrintMiddleElement(Node head){
        if(head == null){
            return;
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void PrintNthNodeFromEnd(Node head, int n){
        if (head == null){
            return;
        }
        Node cur = head;
        int count = 1;
        while (cur.next != null){
            cur = cur.next;
            count++;
        }
        if(count < n){
            return;
        }
        cur = head;
        for (int i = 1; i<count-n+1; i++){
            cur = cur.next;
        }
        System.out.println(cur.data);
    }

    public static Node RemoveDuplicatesFromSortedList(Node head){
        Node cur = head;
        while (cur!=null && cur.next!=null){
            if(cur.data == cur.next.data){
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static void NthNodeFromEndEfficient(Node head, int n){
        if(head == null){
            return;
        }
        Node front = head;
        for (int i = 0; i < n; i++){
            if(front == null){
                return;
            }
            front = front.next;
        }
        Node second = head;
        while (front!=null){
            second = second.next;
            front = front.next;
        }

        System.out.println(second.data);
    }

    public static Node Reverse(Node head){
        Node prev = null;
        Node cur = head;
        while (cur!=null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static Node swappingNodes(Node head, int k){
        ArrayList<Integer> temp = new ArrayList<>();
        for(Node cur = head; cur != null; cur = cur.next){
            temp.add(cur.data);
        }

        System.out.println("Old starting element "+temp.get(k-1));
        System.out.println("Old ending element "+temp.get(temp.size() - k));

        int s = temp.get(temp.size() - k);
        int e = temp.get(k-1);

        temp.set(k-1,s);
        temp.set(temp.size() - k, e);

        System.out.println("new starting element "+temp.get(k-1));
        System.out.println("new ending element "+temp.get(temp.size() - k));

        Node st = null, end = null;

        for (Integer el : temp){
            Node add = new Node(el);
            if (st == null){
                st = add;
                end = st;
            }
            else {
                end.next = add;
                end = end.next;
            }
        }



        return st;
    }

    public static Node SwappingNodesWithoutSpace(Node head, int k){

        int count = 1;
        Node cur = null;
        Node dummy = new Node(-1);
        for(cur = head; cur != null; cur = cur.next){
            if(count == k){
                dummy = cur;
            }
            count++;
        }

        System.out.println("count = "+ count);

        cur = head;
        for (int i = 1; i < count - k; i++){
            cur = cur.next;
        }

        int temp = cur.data;
        cur.data = dummy.data;
        dummy.data = temp;
        return head;
    }

    public static Node ReverseInBetween(Node head, int s, int e){
        Node start = null;
        Node end = null;
        Node left = null;
        Node right = null;
        Node cur = head;
        Node prev = null;
        for(int i = 1; i < s-1; i++){
            cur = cur.next;
        }
        left = head;
        cur = cur.next;

        return head;
    }

    public static Node sortList(Node head){
        Node cur = head;

        ArrayList<Integer> temp = new ArrayList<>();

        while(cur != null){
            temp.add(cur.data);
            cur = cur.next;
        }

        Collections.sort(temp);

        Node newHead = null;
        for (int i = temp.size() - 1; i >= 0; i--){
            newHead = InsertAtBeginning(newHead,temp.get(i));
        }

        return newHead;
    }

    public static Boolean detectLoop(Node head){
        Node slow = head, fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static Node DetectAndRemoveLoop(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null &&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }
        if (slow!=fast){
            return head;
        }
        slow = head;
        while (slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
        return head;
    }

    public static void DeleteNodeWithOnlyPointerGiven(Node ptr){
        ptr.data = ptr.next.data;
        ptr.next = ptr.next.next;
    }

    public static Node SegregateEvenOddNodes(Node head){
        Node es = null, ee = null, os = null, oe = null;
        for (Node cur = head; cur!=null; cur = cur.next){
            int x = cur.data;
            if (x%2==0){
                if(es == null){
                    es = cur;
                    ee = es;
                }
                else {
                    ee.next = cur;
                    ee = ee.next;
                }
            }
            else {
                if(os == null){
                    os = cur;
                    oe = os;
                }
                else {
                    oe.next = cur;
                    oe = oe.next;
                }
            }
        }

        if (os == null || es == null){
            return head;
        }

        ee.next = os;
        oe.next = null;
        return es;
    }

    public static Node SwapNodes(Node head){
        Node cur = head;
        while (cur != null && cur.next != null){
            int temp = cur.data;
            cur.data = cur.next.data;
            cur.next.data = temp;
            cur = cur.next.next;
        }
        return head;
    }

    public static Node MergeTwoSortedLinkedList(Node a, Node b){
        if(a == null){
            return b;
        }
        if (b == null){
            return a;
        }
        Node head = null, tail = null;
        if(a.data <= b.data){
            head = tail = a;
            a = a.next;
        }
        else {
            head = tail = b;
            b = b.next;
        }
        while (a != null && b != null){
            if (a.data <= b.data){
                tail.next = a;
                tail = a;
                a = a.next;
            }
            else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if (a == null){
            tail.next = b;
        }
        else {
            tail.next = a;
        }

        return head;
    }

    public static Node SumLinkedList(Node head1, Node head2){
        Node res = null, end = null;
        int v1,v2,v,c=0;
        while (head1 != null || head2!=null || c != 0){
            if(head1 != null){
                v1 = head1.data;
            }
            else {
                v1 = 0;
            }
            if(head2 != null){
                v2 = head2.data;
            }
            else {
                v2 = 0;
            }

            v = v1 + v2 + c;
            c = v / 10;
            v = v % 10;

//            temp.add(v);
            Node d = new Node(v);

            if(res == null){
                res = d;
                end = res;
            }

            else {
                end.next = d;
                end = end.next;
            }

            if(head1 != null){
                head1 = head1.next;
            }

            if(head2 != null){
                head2 = head2.next;
            }

        }

        return res;
    }

    public static int BinaryToDecimal(Node head){
        int res = 0;
        int count = 0;
        Node cur = head;
        while (cur!=null){
            count++;
            cur = cur.next;
        }

        cur = head;
        while (cur != null){
            res += (int) Math.round(Math.pow(2,count-1) * cur.data);
            cur = cur.next;
            count--;
        }
        return res;
    }

    public static int BinaryToDecimalEfficient(Node head){
        int res = 0;
        while (head != null){
            res = res * 2 + head.data;
            head = head.next;
        }

        return res;
    }

    public static Node Reverseparts(Node head, int k){
        if (head == null || head.next == null){
            return head;
        }

        Stack<Integer> s = new Stack<>();
        Node cur = head;
        for (int i = 0; i < k; i++){
            s.push(cur.data);
            cur = cur.next;
        }

        Node st = null;
        Node ed = null;

        while (!s.isEmpty()){
            Node temp = new Node(s.pop());
            if(st == null){
                st = temp;
                ed = st;
            }
            else {
                ed.next = temp;
                ed = ed.next;
            }
        }

        while (cur!=null){
            s.push(cur.data);
            cur = cur.next;
        }

        while (!s.isEmpty()){
            Node temp = new Node(s.pop());
            if(st == null){
                st = temp;
                ed = st;
            }
            else {
                ed.next = temp;
                ed = ed.next;
            }
        }

        return st;
    }

    public static void main(String[] args) {
        Node head = null;
        head = InsertAtBeginning(head,5);
        head = InsertAtBeginning(head,4);
        head = InsertAtBeginning(head,3);
        head = InsertAtBeginning(head,2);
        head = InsertAtBeginning(head,1);

        head = Reverseparts(head,2);
        PrintList(head);





    }
}
