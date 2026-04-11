public class MergeTwoSortedArrays
{
    public static int[] merge(int[]a,int[]b){
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
    public static void main(String args[]){
        int[]a={1,3,5,7,8,9,11,16,20};
        int[]b={2,4,7,10,25};
        int result[]=merge(a,b);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
