/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */
public class PrintMinNumber {
    public String printMinNumber(int [] numbers){
        if(numbers==null||numbers.length==0){
            return "";
        }
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                String temp1=String.valueOf(numbers[j])+String.valueOf(numbers[j+1]);
                String temp2=String.valueOf(numbers[j+1])+String.valueOf(numbers[j]);
                if (temp1.compareTo(temp2)>0){
                    swap(numbers,j,j+1);
                }
            }
        }
        String str=new String(String.valueOf(numbers[0]));
        for(int i=1;i<numbers.length;i++){
            str+=String.valueOf(numbers[i]);
        }
        return str;
    }
    private void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
}
