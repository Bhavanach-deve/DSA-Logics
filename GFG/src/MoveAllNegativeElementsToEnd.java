public class MoveAllNegativeElementsToEnd
{
    public static void segregateElements(int []arr)
    {
        int n=arr.length;
        int temp[]=new int[n];

        int index=0;

        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args)
    {
        int arr[]={1,-1,3,2,-7,-5,11,6};
        segregateElements(arr);
        for(int ans:arr){
            System.out.print(ans+" ");
        }

    }
}
