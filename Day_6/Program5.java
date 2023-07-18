public class Program5 {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode ini=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            head=head.next;
            fast=fast.next.next;
            if(fast==head){
                while(fast!=ini){
                    fast=fast.next;
                    ini=ini.next;
                }
                return ini;
            }
        }
        return null;
    }
}