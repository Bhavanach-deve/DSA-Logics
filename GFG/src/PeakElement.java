
public class PeakElement
{
    public static int peakElement(int[]arr)
    {
        int n=arr.length;
        //starting elements
        if(n==1||arr[0]>arr[1]){
            return 0;
        }
        //middle elements
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                return i;
            }
        }
        //last elements
        if(arr[n-1]>arr[n-2]){
            return n-1;
        }
        return -1;
    }

   public static void main(String[] args)
   {
       int []arr={1,2,4,5,7,8,3};
       int index=peakElement(arr);
       System.out.println("Peak Index= "+index);
       System.out.println("Peak element= "+arr[index]);


    }
}
