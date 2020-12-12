import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum){
        ArrayList<Integer> ans=new ArrayList<>();
        if(array==null||array.length==0){
            return ans;
        }
        int left=0;
        int right=array.length-1;
        int s=0;
        while (left<right){
            s=array[left]+array[right];
            if(s<sum){
                left++;
            }else if(s>sum){
                right--;
            }else{
                ans.add(array[left]);
                ans.add(array[right]);
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FindNumbersWithSum findNumbersWithSum=new FindNumbersWithSum();
        int[] arrar={1,2,4,7,11,15};
        int sum=15;
        System.out.println(findNumbersWithSum.FindNumbersWithSum(arrar,sum));


    }
}
