import java.util.ArrayList;

//Given an array arr[]  and a list of queries queries[][]. Each query can be one of the following two types:
//Update Query: [1, index, value] --> Update the element at position index in the array to the given value.
//Range Query: [2, L, R] --> Compute and return the Least Common Multiple (LCM) of all elements in the subarray from index L to R (inclusive).
//Process all queries sequentially and return a list containing the results of all Type 2 queries.
class Queries{
    public static ArrayList<Long> processQueries(int[] arr, int[][] queries) {
        ArrayList<Long>ans=new ArrayList<>();
        for(int[]q:queries){
            //Type-1--Update Query
            if(q[0]==1){
                int index=q[1];
                int value=q[2];
                arr[index]=value;
            }
            //Type -2 Range Query
            else if(q[0]==2){
                int L=q[1];
                int R=q[2];
                long lcmValue=arr[L];
                for(int i=L+1;i<=R;i++){
                    lcmValue=lcm(lcmValue,arr[i]);
                }
                ans.add(lcmValue);

            }
        }
        return ans;
    }
    //To find gcd
    public static long gcd(long a,long b)
    {
        while(b!=0){
            long res=a%b;
            a=b;
            b=res;
        }
        return a;

    }
    //To find LCM
    public static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
}
public class RangeLCMQueries
{
    public static void main(String[] args)
    {
        int arr[]={2,3,4,6,8,16};
        int queries[][]={{2,0,2},{1,3,8},{2,2,5}};
        ArrayList<Long>result= Queries.processQueries(arr,queries);
        System.out.println(result);
    }
}
