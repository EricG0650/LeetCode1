import java.util.HashMap;

public class RemoveDuplicatesfromSortedListII {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode p = head;
        while(p != null){
            map.put(p.val,map.getOrDefault(p.val,0)+1);
            p= p.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        p = dummy;

        while(p.next != null){
            int val = p.next.val;
            ListNode p1 = p.next;
            if(map.get(val) >1){
                for(int i = 0; i < map.get(val);i++){
                    p1 = p1.next;
                }
                p.next = p1;
            }else{
                p = p.next;
            }

        }
        return dummy.next;
    }


    public ListNode deleteDuplicates1(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p =dummy;
        ListNode p1 = p.next;
        while(p1 != null){
            while(p1.next != null && p1.val == p1.next.val){
                p1 = p1.next;
            }
            if(p.next == p1){
                p = p.next;
            }else{
                p.next = p1.next;
            }
            p1= p1.next;
        }
        return dummy.next;
    }
}
