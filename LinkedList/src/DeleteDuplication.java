/**
 * 在一个排序的链表中，存在重复的结点，
 * 请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead==null||pHead.next==null){
            return null;
        }
        ListNode dummpy=new ListNode(-1);
        ListNode temp=dummpy;
        dummpy.next=pHead;
        ListNode cur=pHead.next;
        while (cur!=null){
            if(cur.val!=temp.next.val){
                temp=temp.next;
                cur=cur.next;
            }else{
                while (cur!=null&&cur.val==temp.next.val){
                    cur=cur.next;
                }
                temp.next=cur;
                if(cur.next!=null){
                    cur=cur.next;
                }
            }
        }
        return dummpy.next;
    }
}
