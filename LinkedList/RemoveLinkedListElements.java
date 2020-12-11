public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        var dummyHead = new ListNode(-1);
        dummyHead.next = head;
        var prev = dummyHead;
        while (prev.next!=null){
            if(val==prev.next.val){
                prev.next = prev.next.next;
            }
            else
                prev = prev.next;
        }
        return dummyHead.next;
    }

    public ListNode removeElements1(ListNode head,int val){
        if(head == null)
            return null;
        head.next = removeElements1(head.next,val);
        return head.val==val?head.next:head;
    }

    public ListNode removeElements2(ListNode head,int val){
        while (head!=null&& head.val==val){
            head = head.next;
        }
        if(head==null)
            return null;

        var prev = head;
        while (prev.next!=null)
        {
            if(prev.next.val==val)
            {
                prev.next = prev.next.next;
            }
            else
                prev = prev.next;
        }
        return head;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val=x;}
}

