//Given a number n, find the number of ways to represent this number as a sum of 2 or more consecutive natural numbers BRUTE FORCE
public class WaysToExpressasSumofConsecutives
{
    public static int getCount(int n)
    {
        int start=1;
        int end=1;
        int sum=1;
        int count=0;

        while(start<=n/2){
            if(sum<n){
                end++;
                sum+=end;
            }
            else if(sum>n){
                sum-=start;
                start++;
            }
            else{
                if(end-start+1>=2){
                    count++;
                }
                sum-=start;
                start++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int n=15;
        System.out.println(getCount(15));

    }
}
