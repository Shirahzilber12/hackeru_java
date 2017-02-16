package com.company;

/**
 * Created by hackeru on 2/16/2017.
 */
public class Tar2 {
    class Node {
        int value;
        Node next;
    }

   /* public void sortList() {
        Node node = new Node(123);
        Node temp = node;
        Node i = node.next;
        Node j = i.next;
        while (i.next != null) {
            while (j.next != null) {
                if ( i.value < j.value) {
                    temp = i.next;
                    i.next = j.next;
                    j.next = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
    }*/
}






   /* static void bubbleSort(){
        int upTo=arr.length-1;
        boolean isSorted=false;
        while(!isSorted){
            isSorted=true;
            for (int i = 0; i <upTo ; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    isSorted=false;//אם יש פעם שהוא לא נכנס לעשות שום החלפה אז ז"א שהוא סיים את המיון (ולא סומן הדגל בשקר)
                }
            }
            upTo--;//  פחות האיבר האחרון כיון שבכל איטרציה האיבר האחרון הוא האיבר שנכנס למקום שלו
        }
    }*/

