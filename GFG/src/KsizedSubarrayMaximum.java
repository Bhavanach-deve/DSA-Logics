//Given an array arr[] of positive integers and an integer k. You have to find the maximum value for each contiguous subarray of size k. Return an array of maximum values corresponding to each contiguous subarray.
import java.util.ArrayList;

public class KsizedSubarrayMaximum
{
    public static ArrayList<Integer> maxofSubArrays(int arr[], int k)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;

        for(int i=0;i<=n-k;i++)
        {
            int max=arr[i];

            for(int j=i;j<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            ans.add(max);
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,1,4,5,2,3,6};
        int k=3;
        System.out.println(maxofSubArrays(arr,k));

    }
}
