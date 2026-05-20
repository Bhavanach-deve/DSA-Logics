import java.util.HashSet;

public class ProductPairOptimalUsingHashSet
{
    public static boolean productPair(int arr[],int target)
    {
        HashSet<Long> set=new HashSet<>();
        for(int nums:arr)
        {
            if(nums==0){
                if(target==0){
                    return true;
                }
                continue;
            }
            if(target%nums==0){
                long needed=target/nums;
                if(set.contains(needed)){
                    return true;
                }
            }
            set.add((long) nums);
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
