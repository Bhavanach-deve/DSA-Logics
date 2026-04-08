public class CheckIftheArrayIsSorted
{
    public static boolean sorted(int arr[],int i)
    {
        //base case
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        //recursive call
        return sorted(arr,i+1);
    }
    static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 6, 5};

        boolean result = sorted(arr, 0);
        System.out.println(result);


    }
}
