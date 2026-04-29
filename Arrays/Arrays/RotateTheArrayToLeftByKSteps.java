import java.util.Arrays;

public class RotateTheArrayToLeftByKSteps
{
    public static void leftRotate(int arr[],int k)
    {
        int n=arr.length;
        int temp[]= Arrays.copyOfRange(arr,0,k);
        //Shift remaining elements to left
        for(int i=k;i<n;i++)
        {
            arr[i-k]=arr[i];
        }
        //Copy stored elements to the end
        for(int i=0;i<k;i++){
            arr[n-k+i]=temp[i];
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int k=2;
        leftRotate(arr,k);
        System.out.println("Array after Left rotation: " + Arrays.toString(arr));


    }
}
