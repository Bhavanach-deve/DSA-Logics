//Given an array arr[] consisting of n distinct integers, find the maximum count of integers that are binary searchable in the given array. Binary searchable elements are determined using the standard Binary Search implementation described below.
//Initially l is 0 and r is size of array - 1
//while(l <= r), compute mid as floor of (l + r)/2 and compare with mid.
//If the target element is same as mid, return true. Else if mid is smaller, change l = mid + 1, else change r = mid - 1.
public class BinarySearchableCount
{
    public static int binarySearchable(int arr[])
    {
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;

            while(l<=r){
                int mid=l+r/2;

                if(arr[mid]==arr[i]){
                    count++;
                    break;
                }
                if(arr[mid]<arr[i]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        int arr[]={1,3,2};
        int ans=binarySearchable(arr);
        System.out.println(ans);

    }
}
