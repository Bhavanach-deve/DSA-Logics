public class DecrementArrayValues
{
    public static int[] decrement(int arr[]){
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i]-1;
        }
        return temp;

    }

    public static void main(String[] args) {

        int arr[] = {54, 43, 2, 1, 5};
        int[]ans=(decrement(arr));
        for(int res:ans){
            System.out.print(res+" ");
        }
    }
}
