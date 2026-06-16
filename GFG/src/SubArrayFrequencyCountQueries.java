//Given an array arr[] of n integers and a 2D array queries[][] representing q queries, where each queries[i] consists of three integers: l, r, and x. For each query determine how many times the element x appears in the arr[] from index l to r (both inclusive).
//Return a list of integers where the i-th value represents the answer to the i-th query.
import java.util.ArrayList;
public class SubArrayFrequencyCountQueries
{
    public static ArrayList<Integer> freqyInRange(int arr[], int queries[][])
    {
        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int x=queries[i][2];

            int count=0;

            for(int j=l;j<=r;j++){
                if(arr[j]==x)
                    count++;
            }
            ans.add(count);
        }
        return ans;

    }

    public static void main(String[] args)
    {
        int arr[]={11,21,51,101,11,51};
        int queries[][]={{0,4,11},{2,5,51}};
        ArrayList<Integer>res=freqyInRange(arr,queries);
        System.out.println(res);

    }
}
