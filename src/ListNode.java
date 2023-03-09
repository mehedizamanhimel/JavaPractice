import javax.xml.soap.Node;
import java.util.LinkedList;

public class ListNode {

    private ListNode head;
    private int size;
    protected ListNode data;
    protected ListNode next;

    private Node head2;

    private ListNode head3;

    public int getData(){
        return size;
    }

    public ListNode getList(){
        return head;
    }

    public void setData (int i){
        size = i;
    }

    public void setNode1(ListNode ln){
        head = ln;
    }

    public void setNode2(ListNode ln){
        data = ln;
    }

    public void setNode3(ListNode ln){
        next = ln;
    }

    public void setNode4(Node ln){
        head2 = ln;
    }

    public ListNode setLink(){
        return head3;
    }

    public ListNode mergeTwoLists_21(ListNode list1, ListNode list2) {
        if (list1==null) return list2;
        if (list2==null) return list1;

        System.out.println(list1);

        if(list1.size < list2.size){
            list1.next = mergeTwoLists_21(list1.next, list2);
            return list1;
        }

        else {
            list2.next = mergeTwoLists_21(list1, list2.next);
            return list2;
        }
    }


    public ListNode sortList_148(ListNode head) {

        return null;
    }


    public Node deleteDuplicates_83(Node head) {

        Node abc = head;
        if(abc == null) return abc;
        while (abc!=null){

        }
        return null;
    }
}
