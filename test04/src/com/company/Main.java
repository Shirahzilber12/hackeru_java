package com.company;

import static com.company.Tar1.merge;
import static com.company.Tar1.sortKlists1;
import static com.company.Tar1.sortKlists2;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(9);
        Node node2 = new Node(15);
        Node node3 = new Node(17);
        Node node4 = new Node(80);
        Node node5 = new Node(100);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        NodeWithHead nodeWithHead1 = new NodeWithHead(node1);

        Node node6 = new Node(7);
        Node node7 = new Node(15);
        Node node8 = new Node(18);
        Node node9 = new Node(56);
        Node node10 = new Node(92);
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        NodeWithHead nodeWithHead2 = new NodeWithHead(node6);
        nodeWithHead1.next=nodeWithHead2;


       /* Node a=merge(nodeWithHead1.value,nodeWithHead2.value);
        *//*while (a.next!=null) {
            System.out.println(a.value);
            a=a.next;
        }*/
        Node a=sortKlists1(nodeWithHead1);
        while (a.next!=null) {
            System.out.print(a.value+" ");
            a=a.next;
        }
        // Node an = merge(nodeWithHead1, nodeWithHead2);



    }
}


