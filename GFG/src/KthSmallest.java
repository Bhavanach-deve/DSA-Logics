//Given an integer array arr[] and an integer k, find and return the kth smallest element in the given array.
//Note: The kth smallest element is determined based on the sorted order of the array.
import java.util.Arrays;

public class KthSmallest
{
    public static int kthSmallest(int arr[],int k)
    {
        int small=0;
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            small=arr[k-1];
        }
        return small;

    }

    public static void main(String[] args)
    {
        int arr[]={10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k=3;
        System.out.println(kthSmallest(arr,k));

    }
}
