//Given a binary matrix mat[][] containing only 0s and 1s, find the total coverage of all 0's. The coverage of a particular 0 cell is defined by checking 1's in its four directions (left, right, up, and down). For each direction, if there is at least one 1 anywhere between the 0 and the boundary of the matrix, the coverage increases by one.
//Return the sum of the coverage values for all 0 cells in the matrix.
//Examples:
//InInput : [1, 1, 1, 0
//          1, 0, 0, 1]
//Output : 8
//Explanation: Coverage of first zero is 2. Coverages of other two zeros is 3 Total coverage = 2 + 3 + 3 = 8
public class CoverageOfAllZerosInABinaryMatrix
{
    public static int findCoverage(int [][]mat)
    {
        int row=mat.length;
        int col=mat[0].length;
        int totalcount=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    int coverage=0;

                    //Left
                    for(int c=j-1;c>=0;c--){
                        if(mat[i][c]==1){
                            coverage++;
                            break;
                        }
                    }
                    //Right
                    for(int c=j+1;c<col;c++){
                        if(mat[i][c]==1){
                            coverage++;
                            break;
                        }
                    }
                    //Up
                    for(int r=i-1;r>=0;r--){
                        if(mat[r][j]==1){
                            coverage++;
                            break;
                        }
                    }
                    //Down
                    for(int k=i+1;k<row;k++){
                        if(mat[k][j]==1){
                            coverage++;
                            break;
                        }
                    }
                    totalcount+=coverage;
                }
            }
        }
        return totalcount;
    }

    public static void main(String[] args)
    {
        int matrix[][]={{1,1,1,0},{1,0,0,1}};
        System.out.println(findCoverage(matrix));

    }
}
