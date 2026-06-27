//Given a floor of dimensions n × m and an unlimited supply of tiles of size 1 × m, find the total number of ways to completely tile the floor.
//Each tile can be placed in one of the following ways:
//Horizontally, covering 1 row and m columns.
//Vertically, covering m rows and 1 column.
//Count all possible ways to cover the entire floor such that there are no overlaps and no uncovered cells.
//Since the number of possible tilings can be very large, return the answer modulo 109+7.
//Note: n and m are positive integers, and m ≥ 2.
public class WaysToTileTheFloor
{
    static final int MOD=1000000007;

    public static int noOfWaystoTile(int n,int m)
    {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i<m){
                dp[i]=1;
            }
            else if(i==m){
                dp[i]=2;
            }
            else{
                dp[i] = (dp[i - 1] + dp[i - m]) % MOD;
            }
        }
        return (int)dp[n];
    }

    public static void main(String[] args)
    {
        System.out.println(noOfWaystoTile(4,4));

    }
}
