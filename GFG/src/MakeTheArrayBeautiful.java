//Given an array of negative and non-negative integers. You need to make the array beautiful.
//
//An array is beautiful if two adjacent integers, arr[i] and arr[i+1] are either negative or positive. You can do the following operation any number of times until the array becomes beautiful.
//If two adjacent are different i.e. one of them is negative and other is positive, remove them.
//Return the beautiful array after performing the above operation.
//An empty array is also a beautiful array.
//There can be multiple beautiful output arrays. For consistencty with the test cases, scan the array from left to right for removing two adjacent.
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MakeTheArrayBeautiful
{
    static List<Integer>makeTheArrayBeautiful(int []arr) {
        Stack<Integer> res = new Stack<>();

        for(int nums:arr)
        {
            if(!res.isEmpty()&&((res.peek()>0&&nums<0)||(res.peek()<0&&nums>0))){
                res.pop();
            }else{
                res.push(nums);
            }
        }
        return new ArrayList<>(res);
    }
    public static void main(String[] args)
    {
        int arr[]={-2,2,-1,1};
        List<Integer>ans=makeTheArrayBeautiful(arr);
        System.out.println(ans);

    }
}
