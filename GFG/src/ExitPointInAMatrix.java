//Given a matrix mat[][] of size n × m consisting of 0s and 1s. You start at the top-left cell (0, 0) and initially move in the left-to-right direction (i.e., towards the right).
//While traversing the matrix, follow these rules:
//If the current cell contains 0, continue moving in the same direction.
//If the current cell contains 1, change your direction to the right (clockwise turn), and update the cell value to 0.
import java.util.ArrayList;
import java.util.List;

public class ExitPointInAMatrix
{
    public static List<Integer> exit(int mat[][])
    {
        int n=mat.length;
        int m=mat[0].length;

        int row=0;
        int col=0;
        int dir=0;

        while(row>=0 && row<n && col>=0 && col<m){
            if(mat[row][col]==1){
                dir=(dir+1)%4;
                mat[row][col]=0;
            }
            if(dir==0){
                col++;
            }else if(dir==1)
            {
                row++;
            }else if(dir==2){
                col--;
            }else{
                row--;
            }
        }
        if(dir==0){
            col--;
        }else if(dir==1){
            row--;
        }else if(dir==2){
            col++;
        }else{
            row++;
        }
        List<Integer>ans=new ArrayList<>();
        ans.add(row);
        ans.add(col);

        return ans;

    }

   public static void main(String[] args)
   {
       int matrix[][]={{0,0,1},{1,0,0},{0,0,1}};
       System.out.println(exit(matrix));

    }
}
