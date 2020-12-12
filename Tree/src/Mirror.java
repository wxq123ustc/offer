public class Mirror {
    public void mirror(TreeNode root){
        if(root==null){
            return;
        }
        if(root.right==null&&root.left==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
}
