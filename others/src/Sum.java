/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Sum {
    public int Sum_Solution(int n){
        int s=n;
        boolean flag=(n>0)&&((s+=Sum_Solution(n-1))>0);
        return s;
    }

    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println(s.Sum_Solution(5));
    }
}
