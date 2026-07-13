//There are  bags with diamonds in them. The i'th of these bags contains arr[i] diamonds. If you drop a bag with arr[i] diamonds, it changes to arr[i]/2 diamonds and you gain arr[i] diamonds. Dropping a bag takes 1 minute. Find the maximum number of diamonds that you can take if you are given k minutes.
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumDiamonds
{
    public static long maxDiamonds(int[]arr,int k)
    {
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:arr){
            maxHeap.offer(x);
        }
        long ans=0;

        while(k-->0) {
            int max = maxHeap.poll();
            ans = ans + max;
            maxHeap.offer(max / 2);

        }
        return ans;
    }

   public static void main(String[] args)
   {
       int arr[]={2,1,7,4,2};
       int k=3;
       System.out.println(maxDiamonds(arr,k));

    }
}
