//Given an array[],arr of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal: Eg: arr[6]=0,3,2,7,6,-2 remove index zero the sum of even indices is 8 and odd indices is 8. remove index 1 the sum of even indices elements is not equal to the odd elements
public class SpecialIndex
{
    public static void findIndices(int []arr){
        int n=arr.length;
        int totalEven=0,totalOdd=0;
        //Step 1:TotalSum
        for(int i=0;i<n;i++){
            if(i%2==0)totalEven=totalEven+arr[i];
            else totalOdd=totalOdd+arr[i];
        }
        System.out.println(totalEven);
        System.out.println(totalOdd);

        int leftEven=0,leftOdd=0;

        for(int i=0;i<n;i++){
            //remove current element
            if(i%2==0)totalEven=totalEven-arr[i];
            else totalOdd=totalOdd-arr[i];

            //after removal
            int newEven=leftEven+totalOdd;
            int newOdd=leftOdd+totalEven;

            if(newEven==newOdd)
            {
                System.out.println("Valid special index: "+i);
            }
            //update left sums
            if(i%2==0)leftEven=leftEven+arr[i];
            else leftOdd=leftOdd+arr[i];
        }
    }
    public static void main(String[] args)
    {
        int[] arr={4,3,2,7,6,-2};
        findIndices(arr);

    }
}
