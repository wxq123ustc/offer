/**
 * 是否是平衡二叉树
 */
public class IsBalancedTree {
    public boolean IsBalanced_Solution(TreeNode root){
        if(root==null||(root.left==null&&root.right==null)){
            return true;
        }
        if(Math.abs(getHeight(root.left)-getHeight(root.right))>1){
            return false;
        }
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
}
