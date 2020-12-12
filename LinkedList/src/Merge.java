/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Merge {
    public ListNode Merge(ListNode list1,ListNode list2){
        ListNode dummpy=new ListNode(-1);
        ListNode temp=dummpy;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }
        while (list1!=null){
            temp.next=list1;
            list1=list1.next;
            temp=temp.next;
        }
        while (list2!=null){
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }
        return dummpy.next;
    }
}
