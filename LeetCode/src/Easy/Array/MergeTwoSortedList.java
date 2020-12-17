package Easy.Array;

public class MergeTwoSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode tail = dummy;
        while(tail!=null){
            if(l1 == null)
            {
                tail.next = l2;
                break;
            }
            if(l2 == null)
            {
                tail.next = l1;
                break;
            }
            if(l1.val<=l2.val){
                tail.next = l1;
                l1=l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1head = new ListNode(0);
        ListNode l1 = l1head;
        for(int i=1;i<=9;i+=2){
            l1head.next = new ListNode(i);
            l1head = l1head.next;
        }
        ListNode l2head = new ListNode();
        ListNode l2 = l2head;
        for(int i=2;i<=12;i+=2){
            l2head.next = new ListNode(i);
            l2head=l2head.next;
        }
        MergeTwoSortedList mtsl = new MergeTwoSortedList();
        ListNode output = mtsl.mergeTwoLists(l1.next,l2.next);
        while (output!=null){
            System.out.println(output.val);
            output=output.next;
        }
    }
}
