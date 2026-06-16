//There is an array that initially contains only a single value, 0.
//Given a list of queries queries[][] of size q, where each query is of one of the following types:
//0 x: Insert x into the array.
//1 x: Replace every element a in the array with a ^ x, where ^ denotes the bitwise XOR operator.
//Return the array in sorted order after performing all the queries.
import java.util.ArrayList;
import java.util.Collections;

public class ConstructListUsingXORQueriesGFGOptimal
{
    public static ArrayList construction(int[][]queries)
    {
        ArrayList<Integer>list=new ArrayList<>();
        int xor=0;
        list.add(0);
        for(int q[]:queries)
        {
            if(q[0]==0){
                list.add(q[1]^xor);
            }
            else{
                xor^=q[1];
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int l:list){
            ans.add(l^xor);
        }
        Collections.sort(ans);
        return ans;

    }

    public static void main(String[] args)
    {
        int queries[][]={{0,2},{1,3},{0,5}};
        ArrayList<Integer>res=construction(queries);
        System.out.println(res);

    }
}
