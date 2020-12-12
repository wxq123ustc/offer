/**
 *把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array){
        int left=0;
        int right=array.length-1;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            if(right-left==1){
                mid=right;
                break;
            }
            if(array[left]==array[right]&&array[left]==array[mid]){
                return findMin(array,left,right);
            }
            if(array[mid]<=array[left]){
               right=mid;
            }else if(array[mid]>array[left]){
                left=mid;
            }
        }
        return array[mid];
    }
    private int findMin(int[] array,int left,int right){
        int res=array[left];
        for(int i=left+1;i<=right;i++){
            if(res>array[i]){
                res=array[i];
            }
        }
        return res;
    }
}
