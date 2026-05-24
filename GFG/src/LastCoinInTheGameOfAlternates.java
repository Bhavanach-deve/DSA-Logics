//Given an array integer arr[] , representing the values of coins arranged in a row.
//
//Two players play a game by picking coins alternately.
//At each turn, a player can pick a coin from either the beginning or the end of the array. Both players follow a greedy strategy, i.e., they always pick the coin with the maximum value among the two available ends.
//The game continues until only one coin remains.
//Find the value of the last remaining coin.
public class LastCoinInTheGameOfAlternates
{
    public static int coin(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]>=arr[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return arr[left];
    }

    public static void main(String[] args)
    {
        int arr[]={5,3,1,6,9};
        System.out.println(coin(arr));


    }

}
