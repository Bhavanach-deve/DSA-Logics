//Place N queens on an N×N board such that:
//No two queens attack each other
//Attack rules:
//Same row
//Same column
//Same diagonal

public class NQueens
{
    static int N=4;
    public static boolean isSafe(int board[][],int row,int col){
        //check column
        for(int i=0;i<row;i++){
            if(board[i][col]==1)
                return false;
        }
        //Upper Left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1)
                return false;
        }
        //Upper Right Diagonal
        for(int i=row-1,j=col+1;i>=0&&j<N;i--,j++){
            if(board[i][j]==1)
                return false;
        }
        return true;

    }
    public static void solve(int[][]board,int row)
    {
        //base case

        if(row==N)
        {
            printBoard(board);
            System.out.println();
            return;
        }
        for(int col=0;col<N;col++){
            if(isSafe(board,row,col)) {
                //place queen
                board[row][col]=1;

                //recurse
                solve(board, row + 1);

                //back Track
                board[row][col] = 0;
            }
        }
    }
    public static void printBoard(int [][]board)
    {
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args)
    {
        int [][]board=new int[N][N];
        solve(board,0);
    }
}
