import java.util.ArrayList;

public class LeadersInAnArray
{
    public static ArrayList<Integer>leaders (int arr[])
    {
        ArrayList<Integer>ans=new ArrayList<>();

        int max=arr[arr.length-1];
        ans.add(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[]={10,20,22,19,6,7};
        ArrayList<Integer>ans=leaders(arr);
        System.out.println("Leaders in the array are:");
        for(int leaders:ans){
            System.out.println(leaders+" ");
        }
        System.out.println();
    }
}
