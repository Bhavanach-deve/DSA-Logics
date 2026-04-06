public class MooresVotingAlgorithm
{
    public static int majority(int []arr){
        int n=arr.length;
        int candies=0;int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                candies=arr[i];
            }
            if(arr[i]==candies){
                count++;
            }
            else{
                count--;
            }
        }
        //Step 2: Verify candies
        count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==candies){
                count++;
            }
        }
        if (count > arr.length / 2)
            return candies;

        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println("The majority element is: "+majority(arr));

    }
}
