//Given an array arr[] of n integers, modify the array in-place such that each element is replaced with the XOR of its adjacent elements.
//For the first element, update arr[0] = arr[0] ^ arr[1].
//For the last element, update arr[n-1] = arr[n-2] ^ arr[n-1].
//For all other elements, update arr[i] = arr[i-1] ^ arr[i+1].
import java.util.ArrayList;

public class ArrayList2
{
    public static void main(String[] args)
    {
        ArrayList<String> a=new ArrayList<>();
        a.add("Banana");
        a.add("apple");
        a.add("mango");
        System.out.println(a);
        a.remove("mango");
        System.out.println(a);

        ArrayList<Integer> in=new ArrayList<>();
        in.add(1);
        in.add(2);
        in.add(3);
        System.out.println(in);
        in.remove(Integer.valueOf(3));
        System.out.println(in);

    }
}
