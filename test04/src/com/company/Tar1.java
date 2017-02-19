package com.company;

/**
 * Created by hackeru on 2/16/2017.
 */
public class Tar1 {
    public static Node merge(Node a, Node b){

        Node anchor = new Node(123);
        Node tail = anchor;
        while(true){
            if(a == null) {
                //if either list runs out, use the other one.
                tail.next = b;
                break;
            }else if (b == null){
                tail.next = a;
                break;
            }
            if(a.value <= b.value){
                tail.next = a;
                a = a.next;
            }else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        return anchor.next;
    }


    public static Node sortKlists1(NodeWithHead nodeWithHead1)
    {
        Node nodeEzer=nodeWithHead1.value;
        if (nodeWithHead1.next==null)
            return nodeWithHead1.value;
        while (nodeWithHead1.next!=null){
            nodeEzer=merge(nodeEzer,nodeWithHead1.next.value);
            nodeWithHead1=nodeWithHead1.next;
        }
        return nodeEzer;

    }

    static Node sortKlists2(NodeWithHead nodeWithHead1)
    {
        Node nodeEzer1=null;
        Node nodeEzer2=null;
        Node result=null;
        if (nodeWithHead1.next==null)
            return nodeWithHead1.value;
        while (nodeWithHead1.next!=null) {
            nodeEzer1 = merge(nodeWithHead1.value, nodeWithHead1.next.value);
            nodeEzer1=nodeEzer1.next.next;
            nodeEzer1 = merge(nodeWithHead1.value, nodeWithHead1.next.value);
            result=merge(nodeEzer1,nodeEzer2);
        }
        return result;

    }
}
