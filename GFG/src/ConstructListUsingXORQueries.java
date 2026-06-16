//Input: q = 5, queries[] = [[0, 6], [0, 3], [0, 2], [1, 4], [1, 5]]
//Output: [1, 2, 3, 7]
//Explanation:
//[0] (initial value)
//[0, 6] (add 6 to list)
//[0, 6, 3] (add 3 to list)
//[0, 6, 3, 2] (add 2 to list)
//[4, 2, 7, 6] (XOR each element by 4)
//[1, 7, 2, 3] (XOR each element by 5)
//The sorted list after performing all the queries is [1, 2, 3, 7].
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ConstructListUsingXORQueries
{
    public static ArrayList<Integer> constructList(int[][]queries)
    {
        int n= queries.length;

        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(0);
        for(int[]q:queries)
        {
            if(q[0]==0){
                arr.add(q[1]);
            }
            else{
                int x=q[1];

                for(int i=0;i<arr.size();i++)
                {
                    arr.set(i,arr.get(i)^x);
                }
            }

        }
        Collections.sort(arr);
        return arr;

    }
    public static void main(String[] args)
    {
        int queries[][]={{0,6},{0,3},{0,2},{1,4},{1,5}};
        ArrayList<Integer>ans=constructList(queries);
        System.out.println(ans);

    }
}
