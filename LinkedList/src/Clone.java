import java.util.HashMap;

public class Clone {
    public RandomListNode clone(RandomListNode pHead){
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        HashMap<RandomListNode,RandomListNode> map=new HashMap<>();
        RandomListNode cur=pHead;
        while(cur!=null){
            map.put(cur,new RandomListNode(cur.label));
            cur=cur.next;
        }
        cur=pHead;
        while (cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(pHead);

    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}