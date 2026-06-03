//Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.
//Note: If no such array is possible then, return [-1].
import java.util.ArrayList;

public class IndexesOfSubArraySym
{
    public static ArrayList<Integer> subArraySum(int[]arr, int target)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        int start=0;
        int sum=0;
        for(int end=0;end<arr.length;end++){
            sum+=arr[end];

            while(sum>target&&start<=end){
                sum-=arr[start];
                start++;
            }
            if(sum==target){
                ans.add(start+1);
                ans.add(end+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;

    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,7,5};
        int target=12;
        ArrayList<Integer>res=subArraySum(arr,12);
        System.out.println(res);

    }

}
