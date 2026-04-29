import java.util.ArrayList;

public class LeadersInAnArray
{
    public static ArrayList<Integer> leaders(int arr[])
    {
        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            boolean leader=true;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader)
                ans.add(arr[i]);
        }
        return ans;

    }

    public static void main(String[] args)
    {
        int[]arr={4,7,1,0};
        ArrayList<Integer>ans=leaders(arr);
        System.out.println("Leaders in the arrays are: ");
        for(int leaders:ans){
            System.out.println(leaders+" ");
        }
        System.out.println();

    }
}
