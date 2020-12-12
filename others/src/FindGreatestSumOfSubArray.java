/**
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值。要求时间复杂度为 O(n).
 */
public class FindGreatestSumOfSubArray {
    public int findGreatestSumOfSubArray(int[] array){
        int[] dp=new int[array.length];
        int sum=array[0];
        dp[0]=array[0];
        for(int i=1;i<array.length;i++){
            dp[i]=Math.max(dp[i-1]+array[i],array[i]);
            sum=Math.max(dp[i],sum);
        }
        return sum;
    }
}
