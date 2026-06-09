//Given an array of integers arr[] that is first strictly increasing and then maybe strictly decreasing, find the bitonic point, that is the maximum element in the array.
//Bitonic Point is a point before which elements are strictly increasing and after which elements are strictly decreasing.
import java.util.Arrays;

public class BitonicPoint
{
    public static int findMaximum(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-1];
    }
    //Linear Search
    public static int findMax(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //Binary Search
    public static int findMaximumBS(int []arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return arr[low];
    }

   public static void main(String[] args)
   {
       int arr[]={1,3,8,12,4,2};
       System.out.println("Using Sorting-Complexity: O(nlogn)");
       int ans=findMaximum(arr);
       System.out.println(ans);
       System.out.println("Using Linear Search: Complexity: O(n)");
       int lans=findMax(arr);
       System.out.println(lans);
       System.out.println("Using Binary Search: O(logn)");
       int bsAns=findMaximumBS(arr);
       System.out.println(bsAns);

    }
}
