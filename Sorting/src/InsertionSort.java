public class InsertionSort
{
    public static void insertion(int[]arr){
        for(int i=0;i<arr.length;i++)
        {
            int currElement=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>currElement){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currElement;
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,9,6,8,5,4,9};
        insertion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
