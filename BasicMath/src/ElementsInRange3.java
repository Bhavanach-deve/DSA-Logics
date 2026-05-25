public class ElementsInRange3
{
    public static boolean countRange(int start,int end,int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=start&&arr[i]<=end){
                count++;
            }
        }
        return (count==end-start+1)?true:false;
    }

    public static void main(String[] args)
    {
        int arr[]={1,4,5,2,7,8,3};
        int start=2;
        int end=6;
        boolean status=countRange(2,6,arr);
        System.out.println(status);

    }
}
