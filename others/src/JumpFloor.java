/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloor {
    public int jumpFloor(int target){
        if(target==1||target==2){
            return target;
        }
        int a=2;
        int b=1;
        int c=0;
        for(int i=3;i<=target;i++){
            c=a+b;
            b=a;
            a=c;
        }
        return c;
    }
}
