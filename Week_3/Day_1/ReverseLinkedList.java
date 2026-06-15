class Solution {

    //Iterative
    public ListNode reverseList(ListNode head) {
        ListNode curr=head, prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    //Recursive
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode Next=head.next;
        ListNode newHead=reverseList(Next);
        Next.next=head;
        head.next=null;
        return newHead;
    }
}
