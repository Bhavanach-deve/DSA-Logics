//You are given an integer array arr[] that denotes the prices of inividual toys. You are also given an amount k that is the total money you have. You need to maximize the number of toys you can have with the k amount.
import java.util.Arrays;

public class MaximizeNoOFToys
{
    public static int maxToys(int[]arr,int k){
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k=k-arr[i];
                count++;
            }else
            {
                break;

            }
        }
        return count;

    }

   public static void main(String[] args)
   {
       int arr[]={5,4,3,2,1};
       int k=8;
       System.out.println("The maximum number of toys can be buyed with the amount Rs."+k+": "+maxToys(arr,k));

    }
}
