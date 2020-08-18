public class PartitionList {
    public class ListNode {
        int val;
        RemoveDuplicatesfromSortedListII.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, RemoveDuplicatesfromSortedListII.ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode p1 = dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode p2 = dummy2;
        ListNode p = head;
        while(p != null){
            if(p.val< x){
                p1.next = p;
                p = p.next;
                p1.next.next = null;
                p1= p1.next;
            }else{
                p2.next = p;
                p = p.next;
                p2.next.next = null;
                p2= p2.next;
            }

        }

        p1.next = dummy2.next;


        return dummy1.next;

    }
}
