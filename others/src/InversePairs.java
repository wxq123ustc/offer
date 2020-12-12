/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。
 * 即输出P%1000000007
 */
public class InversePairs {
    public int InversePairs(int [] array){
        if(array==null||array.length==0){
            return 0;
        }
        int[] temp=new int[array.length];
        return mergeSort(array,temp,0,array.length-1);
    }
    private int merge(int[] array,int[] temp,int left,int right,int mid){
        int l=left;
        int r=mid+1;
        int res=0;
        int index=left;
        while(l<=mid&&r<=right){
            if(array[l]>array[r]){
                res+=mid-l+1;
                res%=1000000007;
                temp[index++]=array[r++];
            }else{
                temp[index++]=array[l++];
            }
        }
        while(l<=mid){
            temp[index++]=array[l++];
        }
        while (r<=right){
            temp[index++]=array[r++];
        }
        for(int i=left;i<=right;i++){
            array[i]=temp[i];
        }
        return res;
    }
    private int mergeSort(int[] array,int[] temp,int left,int right){
        if(left>=right){
            return 0;
        }
        int res=0;
        int mid=left+(right-left)/2;
        res+=mergeSort(array,temp,left,mid);
        res%=1000000007;
        res+=mergeSort(array,temp,mid+1,right);
        res%=1000000007;
        res+=merge(array,temp,left,right,mid);
        res%=1000000007;
        return res;
    }
}
