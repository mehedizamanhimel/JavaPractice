//import javax.xml.soap.Node;
//import java.util.LinkedList;

public class ListNode {
    int val;
    protected ListNode next;

    public ListNode(int val) {
        this.val = val;

    }

    public ListNode sortList_148(ListNode head) {
        // merge sort: split in the middle, sort both halves, merge
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        return merge(sortList_148(head), sortList_148(second));
    }

    private ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }


}
