public class SelectionSort
{
    public static int getMinIndex(int arr[],int start)
    {
        int minimumIndex=start;
        for(int i=start+1;i<arr.length;i++){
            if(arr[i]<arr[minimumIndex]){
                minimumIndex=i;
            }
        }
        return minimumIndex;
    }
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            int minimumIndex=getMinIndex(arr,i);
            if(i!=minimumIndex){
                int temp=arr[minimumIndex];
                arr[minimumIndex]=arr[i];
                arr[i]=temp;
            }
        }
    }
   public static void main(String[] args) {
       int arr[]={1,2,3,9,6,5,4,9};
       selectionSort(arr);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
