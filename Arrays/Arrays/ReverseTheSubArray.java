import java.util.ArrayList;
import java.util.Arrays;

public class ReverseTheSubArray
{
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
                                                     int r) {
        l--;
        r--;
        while(l<r){
            int temp=arr.get(l);
            arr.set(l,arr.get(r));
            arr.set(r,temp);
            l++;
            r--;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int l=2;
        int r=4;
        ArrayList<Integer>ans=reverseSubArray(arr,l,r);
        System.out.println(ans);

    }
}
