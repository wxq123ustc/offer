/**
 * 数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，
 * 因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum {
    /**
     *
     * @param nums
     * @return
     */
    public int MoreThanHalfNum(int[] nums){
        int time=1;
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(time==0){
                time=1;
                num=nums[i];
            }
            if(nums[i]!=num){
                time--;
            }else{
                time++;
            }
        }
        int counter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num){
                counter++;
            }
            if(counter>nums.length/2){
                return num;
            }
        }
        return 0;
    }
}
