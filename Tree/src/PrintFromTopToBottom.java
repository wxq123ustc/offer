import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * 二叉树的广度优先遍历
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            arr.add(node.val);
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
        return arr;
    }
}
