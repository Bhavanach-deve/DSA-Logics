//Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.
import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeating
{
    public static ArrayList<Integer>findTwoElements(int arr[])
    {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(arr[i]);    // Repeating number
                ans.add(i + 1);     // Missing number
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        int arr[]={4,3,6,2,1,1};
        System.out.println(findTwoElements(arr));

    }
}
