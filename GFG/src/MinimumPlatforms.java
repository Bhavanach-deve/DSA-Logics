//Given arrival arr[] and departure dep[] times of trains on the same day, find the minimum number of platforms needed so that no train waits. A platform cannot serve two trains at the same time; if a train arrives before another departs, an extra platform is needed.
import java.util.Arrays;

public class MinimumPlatforms
{
    public static int minPlatforms(int arr[],int []dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0;
        int platforms=0,maxPlatforms=0;
        while(i<arr.length)
        {
            if(arr[i]<=dep[j]){
                platforms++;
                maxPlatforms=Math.max(platforms,maxPlatforms);
                i++;
            }
            else {
                platforms--;
                j++;
            }
        }
        return maxPlatforms;
    }

    public static void main(String[] args)
    {
        int arr[]={900, 940, 950, 1100, 1500, 1800};
        int dep[]={910,1200,1120,1130,1900,2000};
        System.out.println(minPlatforms(arr,dep));

    }
}
