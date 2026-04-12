public class SortingUnsortedArrayUsingMergeSort
{
    public static int[] mergeTwoSortedArrays(int[]a,int[]b){
        //This function merge two given sorted arrays of diffenent length

        int n=a.length;
        int m=b.length;
        int result[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(a[i]<b[j]){
                result[k]=a[i];//also written as result[k++]=a[i++];
                k++;
                i++;
            }
            else{
                result[k++]=b[j++];
            }
        }
        //if elements of b are completed i.e b has been exhausted
        while(i<n){
            result[k++]=a[i++];
        }
        //if a has been exhausted
        while(j<m){
            result[k++]=b[j++];
        }
        return result;
    }
    public static void merge(int[]arr,int start,int mid,int end){
        int []left=new int[mid-start+1];//start to mid
        int[]right=new int[end-mid];//mid to start
        int k=0;
        for(int i=start;i<=mid;i++){
            left[k]=arr[i];
            k++;
        }
        k=0;
        for(int i=mid+1;i<=end;i++){
            right[k]=arr[i];
            k++;
        }
        int[]result=mergeTwoSortedArrays(left,right);
        k=0;
        //putting back the result into the array
        for(int i=start;i<=end;i++){
            arr[i]=result[k++];
        }
    }
    public static void f(int[]arr,int start,int end){
        if(start>=end)return;
        int mid=(start+end)/2;
        f(arr,start,mid);
        f(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void mergeSort(int[]arr){
        f(arr,0,arr.length-1);
    }
    public static void main(String[] args)
    {
        int arr[]={4,2,7,11,2,-3,6,8,0,2};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
