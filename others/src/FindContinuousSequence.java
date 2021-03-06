import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum){
        int left=1;
        int right=2;
        int s=left+right;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        while (right<=sum/2+1){
            if(s<sum){
                right++;
                s+=right;
            }else if(s>sum){
                s-=left;
                left++;
            }else{
                ArrayList<Integer> temp=new ArrayList<>();
                for(int i=left;i<=right;i++){
                    temp.add(i);
                }
                ans.add(temp);
                s-=left;
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FindContinuousSequence findContinuousSequence=new FindContinuousSequence();
        System.out.println(findContinuousSequence.findContinuousSequence(9));
    }
}
