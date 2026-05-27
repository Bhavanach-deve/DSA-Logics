import java.util.ArrayList;
import java.util.Arrays;

public class DistinctSorted
{
    public static ArrayList<Integer>uniqueSorted(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                res.add(arr[i]);
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int arr[]={3,3,2,2,1,4};
        System.out.println(uniqueSorted(arr));


    }
}
