import java.util.Arrays;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
 */
public class Multiply {
    public int[] multiply(int[] A){
        int[] B=new int[A.length];
        if(A.length==1){
            return B;
        }
        int res=1;
        for(int i=0;i<A.length;i++){
            B[i]=res;
            res*=A[i];
        }
        int ret=1;
        for(int i=A.length-1;i>=0;i--){
            B[i]*=ret;
            ret*=A[i];
        }
        return B;
    }

    public static void main(String[] args) {
        Multiply multiply=new Multiply();
        int[] A={1,2,3,4,5};
        int[] B=multiply.multiply(A);
        System.out.println(Arrays.toString(B));
    }
}
