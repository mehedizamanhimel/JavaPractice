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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ls = new ListNode();

        if (list1==null) return list2;
        if (list2==null) return list1;
        System.out.println(list1);

        /*
        while (list1!= null && list1!= null){

        }
         */

        return ls;
    }

}
