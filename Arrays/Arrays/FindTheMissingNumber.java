import java.util.*;
public class FindTheMissingNumber
{
    public static int missingNum(int arr[]) {
            // code here
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=i+1){
                    return i+1;
                }
            }
            return arr.length+1;
        }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,5,6};
        System.out.println(missingNum(arr)+" is missing from the sequence");
    }
    }
