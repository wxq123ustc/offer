/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Find {
    /**
     * 聪左下角开始进行选择
     * @param target：要查找的数字
     * @param array:二维数组
     * @return
     */
    public boolean find(int target, int [][] array){
        int m=array.length;
        int n=array[0].length;
        int i=m-1;
        int j=0;
        while(i>=0&&j<n){
            if(array[i][j]<target){
                j++;
            }else if(array[i][j]>target){
                i--;
            }else{
                return true;
            }
        }
        return false;
    }
}
