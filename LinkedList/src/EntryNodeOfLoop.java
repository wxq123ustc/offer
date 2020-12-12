/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode slow=pHead;
        ListNode fast=pHead;
        ListNode cur=pHead;
        while (fast!=null){
            if(fast.next==null){
                return null;
            }
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                while (slow!=cur){
                    cur=cur.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
