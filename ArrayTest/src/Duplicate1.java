/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中第一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * 返回描述：
 * 如果数组中有重复的数字，函数返回true，否则返回false。
 * 如果数组中有重复的数字，把重复的数字放到参数duplication[0]中。（ps:duplication已经初始化，可以直接赋值使用。
 */
public class Duplicate1 {

    /**
     * 在不修改数组的前提下找出重复的数组
     * @param numbers
     * @param length
     * @param duplication
     * @return
     */
    public boolean  duplicate(int numbers[],int length,int [] duplication){
        if(numbers==null||numbers.length==0){
            return false;
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0||numbers[i]>=numbers.length){
                return false;
            }
        }
        int low=0;
        int high=numbers.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int counter=countRange(numbers,low,mid);
            if(high==low){
                if(counter>1){
                    duplication[0]=low;
                    return true;
                }else{
                    return false;
                }
            }
            if(counter>(mid-low+1)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;

    }
    public int countRange(int[] numbers,int low,int high){
        if(numbers==null||numbers.length==0){
            return 0;
        }
        int counter=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<=high&&numbers[i]>=low){
                counter++;
            }
        }
        return counter;
    }

}
