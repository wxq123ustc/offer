/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    public void reOrderArray(int [] array){
        int odd=0;
        int even=0;
        int n=array.length;
        while (even<n){
            if(array[even]%2!=0){
                int temp=array[even];
                for(int i=even;i>odd;i++){
                    array[i]=array[i-1];
                }
                array[odd]=temp;
                odd++;
                even++;
            }else{
                even++;
            }
        }
    }
}
