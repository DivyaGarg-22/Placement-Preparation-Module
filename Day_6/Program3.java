class Program3 {
    public static int size1(ListNode head){
        int size=0;
        while(head!=null){
            head=head.next;
            size++;
        }
        return size;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode nxt=curr;
        int count=0;
        int size=0;

        if(size1(head)<k && nxt!=null){
                return nxt;
        }
        else{
            while(curr!=null && count<k){
                nxt=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nxt;
                count++;

            }
            if(nxt!=null){
                head.next=reverseKGroup(nxt,k);
            }
        }
            return prev;
        
    }
}