import java.util.*;
public class ElementsInTheRange2
{
    public static boolean checkElements(int start,int end,int[]arr)
    {
        HashSet<Integer>set=new HashSet<>();
        for(int nums:arr){
            set.add(nums);
        }
        for(int i=start;i<=end;i++){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={1,4,5,2,7,8,3};
        int start=2;
        int end=5;
        boolean status=checkElements(2,5,arr);
        System.out.println(status);

    }

}
