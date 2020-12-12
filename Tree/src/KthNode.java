/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 */
public class KthNode {
    int k1;
    TreeNode target;
    TreeNode KthNode(TreeNode pRoot, int k){
        k1=k;
        if (pRoot==null){
            return null;
        }
        midTree(pRoot);
        return target;
    }
    void midTree(TreeNode pRoot){
        if(pRoot==null||k1<=0){
            return;
        }
        midTree(pRoot.left);
        k1--;
        if(k1==0){
            target=pRoot;
            return;
        }
        midTree(pRoot.right);
    }
}
