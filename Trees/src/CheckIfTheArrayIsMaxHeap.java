public class CheckIfTheArrayIsMaxHeap
{     public static boolean isMaxHeap(int[] arr) {
            // code here
            int n=arr.length;
            for(int i=0;i<=(n-2)/2;i++){

                if(arr[i]<arr[(i*2)+1])
                {
                    return false;
                }
                if((i*2+2)<n && arr[i]<arr[(i*2)+2])
                    return false;
            }
            return true;
        }

    public static void main(String[] args)
    {
        int[] arr={90,15,10,7,12,2};
        System.out.println(isMaxHeap(arr));
    }
}
