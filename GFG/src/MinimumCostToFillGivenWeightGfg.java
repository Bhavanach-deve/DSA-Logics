//Given a bag of size w kg and you are provided costs of packets different weights of oranges in array cost[], find the minimum total cost to buy exactly w kg oranges
//The cost of 1 kg orange is present at index 0 and in general arr[i] has cost of (i+1) kg orange.
//cost[i] = -1 means that 'i+1' kg packet of orange is unavailable.
//If it is not possible to buy exactly w kg oranges then return -1. It may be assumed that there is an infinite supply of all available packet types.
import java.util.Arrays;

public class MinimumCostToFillGivenWeightGfg
{
    public static int minimumCost(int[]cost,int w)
    {
        int arrDP[]=new int[w+1];
        int infinity=100000000;
        Arrays.fill(arrDP,infinity);
        arrDP[0]=0;
        for(int i=0;i<cost.length;i++){
            if(cost[i]==-1){
                continue;
            }
            int weight=1+i;
            for(int j=weight;j<=w;j++){
                arrDP[j]=Math.min(arrDP[j], cost[i] + arrDP[j-weight]);
            }
        }
        return arrDP[w]==infinity?-1:arrDP[w];
    }

    public static void main(String[] args)
    {
        int cost[]={20,10,4,50,100};
        int w=5;
        int minCost=minimumCost(cost,w);
        System.out.println(minCost);


    }
}
