import java.util.Arrays;

public class MinimumHeight
{
    public static int minHeight(int arr[],int k)
    {
        int n=arr.length;
        int difference=arr[n-1]-arr[0];
        Arrays.sort(arr);
        if(n<k)
            return -1;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0){
                continue;
            }
            int minimumHeight=Math.min(arr[0]+k,arr[i]-k);
            int maxHeight=Math.max(arr[i-1]+k,arr[n-1]-k);
            difference=Math.min(difference,maxHeight-minimumHeight);
        }
        return difference;

    }
   public static void main(String[] args)
   {
       int arr[]={1,5,8,10};
       int k=2;
       System.out.println(minHeight(arr,k));

    }
}
