//Given an array arr[] containing distinct positive integers, and two integers start and end defining a range. Determine if the array contains all elements within inclusive range [start, end].
//Note: If the array contains all elements in the given range return true otherwise return false.
public class ElementsInTheRange
{
    public static boolean checkInrange(int start,int arr[],int end){
        for(int i=start;i<=end;i++){
            boolean status=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    status=true;
                }
            }
            if(!status){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int arr[]={1,4,5,2,7,8,3};
        int start=2;
        int end=5;
        boolean status=checkInrange(2,arr,5);
        System.out.println(status);
    }
}
