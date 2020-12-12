/**
 * 二叉树的深度
 */
public class TreeDepth {
    public int TreeDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}