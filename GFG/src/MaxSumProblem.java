//Given a number n, find its maximum sum value with 3 recursive breaks described below.
// Input: n = 12
//Output: 13
//Explanation: Break n = 12 in three parts [12/2, 12/3, 12/4] = [6, 4, 3], now current sum is = (6 + 4 + 3) = 13. Further breaking 6, 4 and 3 into parts will produce sum less than or equal to 6, 4 and 3 respectively.
public class MaxSumProblem
{
    public static int maxSum(int n)
    {
        if(n==0){
            return 0;
        }
        int breakSum=maxSum(n/2)+maxSum(n/3)+maxSum(n/4);

        return Math.max(n,breakSum);
    }

   public static void main(String[] args)
   {
       int n=24;
       System.out.println("The maximum sum value with 3 recursive breaks is : "+maxSum(n));

   }
}
