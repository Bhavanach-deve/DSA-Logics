//Given an array arr[] of integers and a number x, the task is to find the sum of subarray having a maximum sum less than or equal to the given value of x.
class FindMaxSum
{
    public long findMaxSubArraySum(int arr[],int x)
    {
        long maxSum=0;
        int left=0;
        long sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            // shrink window
            while(sum>=x)
            {
                sum=sum-arr[left];
                left++;

            }
            //valid sum
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }

}
public class MaximumSumOfSubarrayLessthanorEqualtoX
{

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int arr1[]={2,4,6,8,10};
        int x=11;
        //int x1=7;
        FindMaxSum sum=new FindMaxSum();
        long res=sum.findMaxSubArraySum(arr,x);
        //long res1=sum.findMaxSubArraySum(arr1,x1);
        System.out.println("SubArray having maximum sum is: "+res);
        //System.out.println();
        //System.out.println("SubArray having maximum sum is: "+res1);



    }

}
