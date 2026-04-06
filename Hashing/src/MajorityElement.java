//Given N elements find the frequency of the elements where it's occurance is greater than n/2.

import java.util.HashMap;

public class MajorityElement
{
    public static int majority(int[]arr){
        int n=arr.length;

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0) + 1);
            //This checks:
            //If num exists in map → return its value
            //If NOT → return 0
            // + 1
            //We increment the count map.put(num, ...)
            //
            //Store updated value back into map frequency[num] = frequency[num] + 1
            //(if not present → start from 0)
            if(map.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[]={2,2,2,2,1,3,4};
        System.out.println(majority(arr));

    }
}
