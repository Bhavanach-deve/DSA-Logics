public class FindTheMissingNumber
{
    public static int missingNum(int arr[]){
        int n=arr.length+1;

        int total=n*(n+1)/2;
        int sum=0;
        for(int nums:arr){
            sum=sum+nums;
        }
        return total-sum;
    }

   public static void main(String[] args)
   {
       int arr[]={1,2,3,5};
       System.out.println(missingNum(arr));

    }
}
