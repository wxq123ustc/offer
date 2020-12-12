/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class NumberOf1Between1AndN {
    public int numberOf1Between1AndN_Solution(int n){
        int high=n/10;
        int cur=n%10;
        int digit=1;
        int low=0;
        int count=0;
        while(high!=0||cur!=0){
            if(cur==0){
                count+=high*digit;
            }else if(cur==1){
                count+=high*digit+low+1;
            }else{
                count=(high+1)*digit;
            }
            low+=cur*digit;
            digit=digit*10;
            cur=high%10;
            high=high/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=13;
        NumberOf1Between1AndN number=new NumberOf1Between1AndN();
        System.out.println(number.numberOf1Between1AndN_Solution(n));
    }
}
