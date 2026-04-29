import java.util.Arrays;

public class RightRotateTheArray
{
    public static void rightRotate(int arr[],int k) {
        int n=arr.length;
        //Copy last k elements
        int []temp= Arrays.copyOfRange(arr,n-k,n);
        //Shift the remaining elements to the right
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        //Copy the stored elements to the front
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7};
        rightRotate(arr,2);
        System.out.println("Array after right rotation: " + Arrays.toString(arr));
    }
}
