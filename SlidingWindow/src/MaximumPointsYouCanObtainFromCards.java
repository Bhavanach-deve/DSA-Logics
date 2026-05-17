public class MaximumPointsYouCanObtainFromCards
{
    public static int sliding(int arr[],int k)
    {
        int n=arr.length;
        int leftSum=0;
        int rightSum=0;
        int maxSum=0;
        for(int i=0;i<k;i++) {
            leftSum = leftSum + arr[i];
        }
        maxSum = leftSum;
        int rightIndex=n-1;
            //move window
            for(int i=k-1;i>=0;i--) {
                leftSum = leftSum - arr[i];
                rightSum = rightSum + arr[rightIndex];
                rightIndex--;

                maxSum = Math.max(maxSum,leftSum+rightSum);

            }
        return maxSum;
    }

    public static void main(String[] args)
    {
        int arr[]={6,2,3,4,7,2,1,7,1};
        int k=4;
        int maxCardsSum=sliding(arr,k);
        System.out.println(maxCardsSum);

    }
}
