/**
 * 统计一个数字在升序数组中出现的次数。
 */
public class GetNumberOfK {
    public static void main(String[] args) {

    }
    public int getNumberOfK(int [] array , int k){
        if(array==null||array.length==0){
            return 0;
        }
        int first=getFirst(array,k);
        int last=getLast(array,k);
        if(first!=-1&&last!=-1){
            return last-first+1;
        }
        return 0;
    }
    public int getFirst(int[] array,int k){
        int left=0;
        int right=array.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(array[mid]==k){
                if(mid==0||(mid>0&&array[mid]!=array[mid-1])){
                    return mid;
                }else{
                    left=mid-1;
                }
            }else if(array[mid]<k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public int getLast(int[] array,int k){
        int left=0;
        int right=array.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(array[mid]==k){
                if(mid==array.length-1||(mid<array.length-1&&array[mid]!=array[mid+1])){
                    return mid;
                }else{
                    left=mid+1;
                }
            }else if(array[mid]<k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
