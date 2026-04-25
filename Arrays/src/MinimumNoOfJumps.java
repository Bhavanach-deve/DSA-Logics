//Add program to find minimum no.of jumps to reach end using greedy approach"
public class MinimumNoOfJumps
{
    public static int minJumps(int arr[]){
        int jumps=0,l=0,r=0;
        int n=arr.length;

        while(r<n-1){
            int farthest=0;

            for(int i=l;i<=r;i++){
                farthest=Math.max(farthest,i+arr[i]);
            }
            l=r+1;
            jumps=jumps+1;
            r=farthest;

            if(l>r)return -1;
        }
        return jumps;
    }

    public static void main(String[] args)
    {
        int arr[]={2,3,1,1,4};
        System.out.println(minJumps(arr));

    }
}
