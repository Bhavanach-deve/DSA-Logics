//Given a array arr[] of positive integers, find the smallest positive integer such that it cannot be represented as the sum of elements of any subset of the given array set.
import java.util.Arrays;

public class NotASubSet
{
    public static int findSmallest(int[] arr) {

        Arrays.sort(arr);

        int reachable = 0;

        for (int num : arr) {

            // Gap found
            if (num > reachable + 1) {
                return reachable + 1;
            }

            reachable += num;
        }

        return reachable + 1;
    }
    public static void main(String[] args) {
        int arr[]={3,9,6,20,28,10};
        int result=findSmallest(arr);
        System.out.println(result);

    }
}
