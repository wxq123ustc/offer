/**
 * 输入一个整型数组，数组里有正数也有负数。
 * 数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值。要求时间复杂度为 O(n).
 */
public class FindGreatestSumOfSubArray {
    public static int findGreatestSumOfSubArray(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={1,-2,3,10,-4,7,2,-5};
        int s=findGreatestSumOfSubArray(nums);
        System.out.println(s);
    }
}
