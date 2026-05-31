//You are given an integer array arr[] of integers. You need to find how many elements exist if we count the elements only once. That is repeated elements are counted as occuring once.
import java.util.HashSet;

public class CountOnlyOnce
{
    public static int countOnce(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int nums:arr){
            set.add(nums);
        }
        return set.size();
    }

    public static void main(String[] args)
    {
        int arr[]={8,8,6,5,9,9,2};
        System.out.println(countOnce(arr));
        int arr1[]={7,7,7,7,7,7,7,7};
        System.out.println(countOnce(arr1));

    }
}
