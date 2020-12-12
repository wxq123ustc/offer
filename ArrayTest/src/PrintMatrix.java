import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix){
        ArrayList<Integer> ans=new ArrayList<>();
        help(matrix,0,matrix.length-1,0,matrix[0].length-1,ans);
        return ans;
    }
    public void help(int[][] matrix,int startrow,int endrow,int startcol,int endcol,ArrayList<Integer> ans){
        if(startrow<0||startrow>endrow||startcol<0||startcol>endcol){
            return;
        }
        if(startrow<endrow&&startcol<endcol) {
            for (int j = startcol; j <= endcol; j++) {
                ans.add(matrix[startrow][j]);
            }
            for (int i = startrow + 1; i <= endrow; i++) {
                ans.add(matrix[i][endcol]);
            }
            for (int j = endcol - 1; j >= 0; j++) {
                ans.add(matrix[endrow][j]);
            }
            for (int i = endrow - 1; i > 0; i--) {
                ans.add(matrix[i][startcol]);
            }
            help(matrix,startrow+1,endrow-1,startcol+1,endcol-1,ans);
        }else if(startrow==endrow&&startcol<endcol){
            for(int j=startcol;j<=endcol;j++){
                ans.add(matrix[startrow][j]);
            }
        }else if(startrow<=endrow&&startcol==endcol){
            for(int i=startrow;i<=endrow;i++){
                ans.add(matrix[i][startcol]);
            }
        }else if(startcol==endcol&&endrow==startrow){
            ans.add(matrix[startrow][startcol]);
        }else{
            return;
        }
    }

}
