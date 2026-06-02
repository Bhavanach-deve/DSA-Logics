//Given an array of integers and a number k, the task is the find maximum pair sum with the following conditions on the pairs.
//Pair difference should be less than k.
//Pairs should be disjoint. For example if (x, y) is a result pair, then neither x nor y should appear in any other result pair.
//Sum of p pairs means sum of 2p elements in the result.
//If no valid pairs can be formed, return 0.
import java.util.Arrays;

public class PairsWithCertainDifference
{
    public static int sumDiffPairs(int arr[],int k)
    {
        int sum=0;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-1;i>0;){
            if(arr[i]-arr[i-1]<k){
                sum+=arr[i]+arr[i-1];
                i-=2;
            }
            else{
                i--;
            }
        }
        return sum;

    }

    public static void main(String[] args)
    {
        int arr[]={3,5,10,15,17,12,9};
        System.out.println(sumDiffPairs(arr,4));

    }
}
