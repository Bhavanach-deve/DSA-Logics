//Given an integer array arr[] and an integer target, determine whether there exists a pair of elements in the array whose product is equal to target.
public class ProductPairsBruteForce
{
    public static boolean productPair(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]*arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

   public static void main(String[] args)
   {
       int arr[]={10,20,9,40};
       int target=400;
       Boolean status=productPair(arr,target);
       System.out.println(status);

    }
}
