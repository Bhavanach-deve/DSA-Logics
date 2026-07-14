//Given an array arr[], find the smallest number x such that when x is processed sequentially with each element of the array (from index 0 to n-1), it never becomes negative, under the following conditions:
//If x is greater than the current array element, x is increased by the difference between x and the array element.
//If x is less than or equal to the current array element, x is decreased by the difference between the array element and x.
public class SmallestNonZeroNumber
{
    public static int smallest(int arr[]){
        int x=0;
        while(true){
            long curr=x;
            boolean ok=true;
            for(int nums:arr){
                curr=2*curr-nums;

                if(curr<0){
                    ok=false;
                    break;
                }
            }
            if(ok){
                return x;
            }
            x++;
        }
    }

   public static void main(String[] args)
   {
       int arr[]={3,4,3,2,4};
       System.out.println(smallest(arr));

    }
}
