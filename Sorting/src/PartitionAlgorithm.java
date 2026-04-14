public class PartitionAlgorithm
{
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int[]arr,int l,int r,int pi){
        int pivot=arr[pi];//remember our pivot element
        swap(arr,pi,r);//store the pivot element at the last index
        int m=l;
        for(int i=l;i<=r-1;i++){
            if(arr[i]<pivot){
                swap(arr,i,m);
                m++;//middle element that is everything to left of it should be less and righ should be more
            }
        }
        swap(arr,m,r);
        return m;
    }

    public static void main(String[] args)
    {
        int arr[]={4,2,7,11,2,-3,6,8,0,2};
        int p=partition(arr,0,arr.length-1,7);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Pivot: "+p);

    }
}
