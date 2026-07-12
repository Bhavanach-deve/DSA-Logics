import java.util.Arrays;

//Given an integer array arr[], where arr[i] denotes the number of tickets available with the i-th ticket seller.
//The price of each ticket is equal to the number of tickets remaining with that seller at the time of sale.
//A seller can sell at most one ticket at a time, and after each sale, the price of the next ticket from that seller decreases by 1.
//All sellers are allowed to sell at most k tickets in total.
public class MaxAmountBySellingKTicketsGfG
{
    static final int MOD=100000007;

    public static int maxAmount(int arr[],int k)
    {
        long ans=0;
        while(k-->0){
            int maxIndex=0;

            for(int i=1;i<arr.length;i++){
                if(arr[i]>arr[maxIndex]){
                    maxIndex=i;
                }
            }
            if(arr[maxIndex]==0){
                break;
            }
            ans=(ans+arr[maxIndex]);
            arr[maxIndex]--;
        }
        return (int)ans;

    }

    public static void main(String[] args)
    {
        int arr[]={4,3,6,2,4};
        System.out.println(maxAmount(arr,3));


    }
}
