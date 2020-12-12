import java.util.HashMap;

/**
 * 重建二叉树
 * 根据前序遍历和中序遍历
 */
public class ReConstructBinaryTree {
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre,int [] in){
        if(pre==null||in==null){
            return null;
        }
        TreeNode root=reConstructBinaryTree(pre,in,0,pre.length-1,0,in.length-1);
        return root;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in,int ps,int pe,int is,int ie){
        if(ps>pe||is>ie){
            return null;
        }
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        int rootVal=pre[ps];
        int ir=map.get(rootVal);
        TreeNode root=new TreeNode(rootVal);
        int leftTreeLength=ir-is;
        int rightTreeLength=ie-ir;
        root.left=reConstructBinaryTree(pre,in,ps+1,ps+(ir-is),is,ir-1);
        root.right=reConstructBinaryTree(pre,in,ps+(ir-is)+1,pe,ir+1,ie);
        return root;
    }
}
