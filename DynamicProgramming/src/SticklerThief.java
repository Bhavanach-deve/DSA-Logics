//Stickler the thief wants to loot money from the houses arranged in a line. He cannot loot two consecutive houses and aims to maximize his total loot.
//Given an array, arr[] where arr[i] represents the amount of money in the i-th house. Determine the maximum amount he can loot.
public class SticklerThief
{
    public static int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;

        if (n == 1)
            return arr[0];

        int[] dp = new int[n];

        dp[0] = arr[0];

        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {

            int loot =
                    arr[i] + dp[i - 2];

            int skip =
                    dp[i - 1];

            dp[i] =
                    Math.max(loot, skip);
        }

        return dp[n - 1];
    }

    public static void main(String[] args)
    {
        int arr[]={5,3,4,11,2};
        int result=findMaxSum(arr);
        System.out.println(result);

    }
}
