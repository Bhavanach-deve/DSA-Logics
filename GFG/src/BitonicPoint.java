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

   public static void main(String[] args)
   {
       int arr[]={120,100,80,20,0};
       int ans=findMaximum(arr);
       System.out.println(ans);
       System.out.println("Using Linear Search: ");
       int lans=findMax(arr);
       System.out.println(lans);

    }
}
