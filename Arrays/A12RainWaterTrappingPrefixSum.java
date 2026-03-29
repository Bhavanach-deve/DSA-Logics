import java.util.Scanner;
public class A12RainWaterTrappingPrefixSum
{
    public static int trap(int[]arr,int n){
        int [] leftMax=new int[n];
        int [] rightMax=new int[n];

        //leftMax
        leftMax[0]=arr[0];
        for(int l=1;l<n;l++){
            leftMax[l]=Math.max(leftMax[l-1],arr[l]);
        }
        //rightMax
        rightMax[n-1]=arr[n-1];
        for(int r=n-2;r>=0;r--){
            rightMax[r]=Math.max(rightMax[r+1],arr[r]);
        }

        //Sum of Water
        int water=0;
        for(int w=0;w<n;w++){
            water=water+Math.min(leftMax[w],rightMax[w])-arr[w];
        }
        return water;


    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Buildings: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the height of the buildings: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sumOFRainWaterStored=trap(arr,n);
        System.out.println("The total amount of trapped rainwater is : "+sumOFRainWaterStored);

    }
}
