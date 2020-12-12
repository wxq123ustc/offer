import java.util.ArrayList;

/**
 * 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class FindPath {
    ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
    ArrayList<Integer> path=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
        if(root==null){
            return ans;
        }
        dfs(root,target);
        return ans;
    }
    public void dfs(TreeNode root,int target){
        if(root==null){
            return;
        }
        path.add(root.val);
        target-=root.val;
        if(target==0&&(root.left==null&&root.right==null)){
            ans.add(new ArrayList<>(path));
        }
        dfs(root.left,target);
        dfs(root.right,target);
        path.remove(path.size()-1);
    }
}
