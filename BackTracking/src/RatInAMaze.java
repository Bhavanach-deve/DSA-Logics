public class RatInAMaze
{
    static int n=4;

    public static boolean solve(int[][]maze,int i,int j,int[][]path){
        //destination reached
        if(i==n-1&&j==n-1){
            path[i][j]=1;
            return true;
        }
        //check Valid move
        if(i>=0&&j>=0&&i<n&&j<n&&maze[i][j]==1){
            path[i][j]=1;
            //move right
            if(solve(maze,i,j+1,path))
                return true;
            //move down
            if(solve(maze,i+1,j,path))
                return true;

            //Back Tracking
            path[i][j]=0;
            return false;
        }
        return false;
    }

    public static void main(String[] args)
    {
        int [][]maze={{1,0,0,0},{1,1,0,1},{0,0,1,0},{1,1,1,1}};
        int path[][]=new int[n][n];
        if(solve(maze,0,0,path))
        {
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(path[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("No Path");
    }
}
