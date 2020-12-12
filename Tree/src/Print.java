import java.util.*;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Print {
    public List<List<Integer>> print(TreeNode pRoot){
        List<List<Integer>> ans=new ArrayList<>();
        if (pRoot==null){
            return ans;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        int level=0;
        queue.offer(pRoot);
        while (!queue.isEmpty()) {
            int n = queue.size();
            LinkedList<Integer> temp=new LinkedList<>();
            //ArrayList<Integer> temp2=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node=queue.poll();
                if (level % 2 == 0) {
                    temp.addLast(node.val);
                }else{
                    temp.addFirst(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }

            ans.add(temp);
        }
        return ans;
    }
}
