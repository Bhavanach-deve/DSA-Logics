//Given an array, arr[] construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].
//Note: Each element is res[] lies inside the 32-bit integer range.
public class ProductArrayPuzzle
{
    public static int[] productExceptself(int arr[]){

        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            int product =1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    product*=arr[j];
                }
            }
            temp[i]=product;
        }
        return temp;
    }

    public static void main(String[] args)
    {
        int arr[]={10,3,5,6,2};
        int ans[]=productExceptself(arr);
        for(int res:ans){
            System.out.print(res+" ");
        }

    }
}
