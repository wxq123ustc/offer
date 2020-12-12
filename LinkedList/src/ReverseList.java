/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode p=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=p;
            p=head;
            head=temp;
        }
        return p;
    }
}
