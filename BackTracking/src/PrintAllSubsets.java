import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets
{
    public static void generate(int[]arr, int index, List<Integer>current){
        //print current subset
        System.out.println(current);
        //explore further elements
        for(int i=index;i<arr.length;i++){
            //chose
            current.add(arr[i]);

            //explore
            generate(arr,i+1,current);

            //backTrack
            current.remove(current.size()-1);

        }
    }

    public static void main()
    {
        int arr[]={1,2,3};
        generate(arr,0,new ArrayList<>());

    }
}
