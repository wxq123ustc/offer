import java.util.HashMap;
import java.util.Map;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class FindNumsAppearOnce {
    public void findNumsAppearOnce(int [] array,int num1[] , int num2[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        int[] res=new int[2];
        int index=0;
        for(Map.Entry<Integer,Integer> item: map.entrySet()){
            if(item.getValue()==1){
                res[index++]=item.getKey();
            }
        }
        num1[0]=res[0];
        num2[0]=res[1];
    }
}
