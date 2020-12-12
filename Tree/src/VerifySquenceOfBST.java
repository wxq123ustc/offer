/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBST {
    public boolean verifySquenceOfBST(int [] sequence){
        if(sequence==null||sequence.length==0){
            return false;
        }
        int left=0;
        int right=sequence.length-1;
        return verifySquenceOfBST(sequence,left,right);
    }
    public boolean verifySquenceOfBST(int [] sequence,int left,int right){
        int root=sequence[right];
        int i=0;
        while (sequence[i]<root){
            i++;
        }
        int index=i;
        for(int j=i;j<sequence.length;j++){
            if(sequence[j]<root){
                return false;
            }
        }
        return verifySquenceOfBST(sequence,left,index-1)&&verifySquenceOfBST(sequence,index+1,right);
    }
}
