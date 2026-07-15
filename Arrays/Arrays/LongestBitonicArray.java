//Given an array arr[] of size n containing positive integers, return the maximum length of the bitonic subarray.
//A subarray arr[i...j] is considered bitonic if its elements first monotonically increase, and then monotonically decrease. Formally, there exists and index k (where i <= k <= j) such that:
//arr[i] <= arr[i+1] <= . . . <= arr[k]
//arr[k] >= arr[k+1] >= . . . >= arr[j]
public class LongestBitonicArray
{
    public static int bitonic(int arr[]){
        int maxLen=1;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int j=i;

            while(j+1<n && arr[j]<=arr[j+1]){
                j++;
            }
            while(j+1<n && arr[j]>=arr[j+1]){
                j++;
            }

            maxLen=Math.max(maxLen,j-i+1);
        }
        return maxLen;

    }

   public static void main(String[] args)
   {
       int arr[]={12,4,78,90,45,23};
       System.out.println(bitonic(arr));

    }
}
