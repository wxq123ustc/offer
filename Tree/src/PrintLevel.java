import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class PrintLevel {
    ArrayList<ArrayList<Integer>> print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(pRoot==null){
            return ans;
        }
        Queue<TreeNode>queue=new ArrayDeque<>();
        queue.offer(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
