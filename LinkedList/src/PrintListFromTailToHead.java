import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<ListNode> stack=new Stack<>();
        ListNode cur=listNode;
        while(cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while (!stack.isEmpty()){
            ans.add(stack.pop().val);
        }
        return ans;
    }
}
class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }