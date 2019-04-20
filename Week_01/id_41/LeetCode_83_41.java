public class LeetCode_83_41 {
    public ListNode deleteDuplicates(ListNode head) {


        if(head==null||head.next==null){
            return head;
        }


        if(head.next!=null){
            head.next=deleteDuplicates(head.next);
        }

        if(head.val==head.next.val){
            head=head.next;
        }

        return head;
    }
}
