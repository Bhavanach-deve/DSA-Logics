//Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1
public class BinarySearch
{
    public static int firstSearch(int arr[],int k)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int k=4;
        System.out.println(firstSearch(arr,k));

    }
}
