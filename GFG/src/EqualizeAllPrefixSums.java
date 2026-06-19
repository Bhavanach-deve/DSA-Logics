//Given a sorted array arr[]. For each i(0 ≤ i ≤ n-1), make all the elements of the array from index 0 to i equal, using the minimum number of operations.
//In one operation you either increase or decrease the array element by 1. Return an array that contains the minimum number of operations for each i, to accomplish the above task.
import java.util.ArrayList;

public class EqualizeAllPrefixSums
{
    public static ArrayList optimalArrays(int []arr)
    {
        ArrayList<Integer>res=new ArrayList<>();
        res.add(0);
        for(int i=1;i<arr.length;i++){
            res.add(res.get(res.size()-1)+(arr[i]-arr[i/2]));

        }
        return res;
    }


    public static void main(String[] args)
    {
        int arr[]={1,6,9,12};
        ArrayList<Integer>ans=optimalArrays(arr);
        System.out.println(ans);
    }
}
