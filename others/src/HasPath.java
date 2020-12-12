/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，
 * 向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，
 * 则该路径不能再进入该格子。
 * 例如 \begin{bmatrix} a & b & c &e \\ s & f & c & s \\ a & d & e& e\\ \end{bmatrix}\quad
 * 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
 * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 */
public class HasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        int[] used=new int[rows*cols];
        return helper(matrix,rows,cols,str,0,0,0,used);
    }
    public boolean helper(char[] matrix,int rows,int cols,char[] str,int row,int col,int k,int[] used){
        int index=row*cols+col;
        if(col<0||col>cols||row<0||row<rows||matrix[index]!=str[k]||used[index]==1){
            return false;
        }
        if(k==str.length-1){
            return true;
        }
        used[index]=1;
        if(helper(matrix,rows,cols,str,row+1,col,k+1,used)||
                helper(matrix,rows,cols,str,row-1,col,k+1,used)||
                helper(matrix,rows,cols,str,row,col-1,k+1,used)||
                helper(matrix,rows,cols,str,row,col+1,k+1,used)){
            return true;
        }
        used[index]=0;
        return false;
    }
}
