import java.util.ArrayList;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 *
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Convert {
    public TreeNode convert(TreeNode pRootOfTree){
        ArrayList<TreeNode> ans=new ArrayList<>();
        midTree(pRootOfTree,ans);
        for(int i=0;i< ans.size()-1;i++){
            ans.get(i).right=ans.get(i+1);
            ans.get(i+1).left=ans.get(i);
        }
        return ans.get(0);
    }
    public void midTree(TreeNode pRootOfTree, ArrayList<TreeNode> ans){
        if(pRootOfTree==null){
            return;
        }
        midTree(pRootOfTree.left,ans);
        ans.add(pRootOfTree);
        midTree(pRootOfTree.right,ans);
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