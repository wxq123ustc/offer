/**
 *假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 */
public class MaxProfit {
    public int maxProfit(int[] prices){
        if(prices==null||prices.length==0){
            return 0;
        }
        int min=prices[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i-1]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        MaxProfit maxProfit=new MaxProfit();
        System.out.println(maxProfit.maxProfit(prices));
    }
}
