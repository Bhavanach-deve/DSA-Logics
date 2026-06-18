public class CoverageOfAllZerosInABinaryMatrixOptimal
{
    public static int coverage(int mat[][])
    {
        int m=mat.length;
        int n=mat[0].length;
        boolean[][]left=new boolean[m][n];
        boolean[][]right=new boolean[m][n];
        boolean[][]up=new boolean[m][n];
        boolean[][]down=new boolean[m][n];
        //left
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                left[i][j]=left[i][j-1]||mat[i][j-1]==1;
            }
        }
        //right
        for(int i=0;i<m;i++){
            for(int j=n-2;j>=0;j--){
                right[i][j]=right[i][j+1]||mat[i][j+1]==1;
            }
        }
        //up
        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                up[i][j]=up[i-1][j]||mat[i-1][j]==1;
            }
        }
        //down
        for(int j=0;j<n;j++){
            for(int i=m-2;i>=0;i--){
                down[i][j]=down[i+1][j]||mat[i+1][j]==1;
            }
        }
        int total=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    if(left[i][j])total++;
                    if(right[i][j])total++;
                    if(up[i][j])total++;
                    if(down[i][j])total++;
                }
            }
        }

        return total;
    }


   public static void main(String[] args)
   {
       int matrix[][]={{1,1,1,0},{1,0,0,1}};
       System.out.println(coverage(matrix));

    }
}
