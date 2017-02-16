class SListNode {
    Object item;
    SListNode next;


    SListNode(Object obj) {
        item = obj;
        next = null;
    }


    SListNode(Object obj, SListNode next) {
        item = obj;
        this.next = next;
    }

}
public class SList {

    private SListNode head;
    private SListNode temp;

    public void sortList() {
        SListNode node = head,i,j;
        head = node;
        i = node;
        j = node.next;
        while(i.next != null) {
            while(j.next != null) {
                if((Integer)i.item < (Integer)j.item) {
                    temp = i.next;
                    i.next = j.next;
                    j.next = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
    }
}
/*
public class Tar2 {
    SListNode head;
    SListNode temp;

    public void sortList() {
        SListNode node = head,i,j;
        head = node;
        i = node;
        j = node.next;
        while(i.next != null) {
            while(j.next != null) {
                if((Integer)i.item < (Integer)j.item) {
                    temp = i.next;
                    i.next = j.next;
                    j.next = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
    }
}*/
