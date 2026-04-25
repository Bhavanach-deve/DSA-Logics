import java.util.Scanner;

public class A13RainWaterTrappingTwoPointer
{
    public static int trap(int[]arr,int n){
        int left=0;
        int right=arr.length-1;
        int leftMax=0;
        int rightMax=0;
        int water=0;

        while(left<right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= leftMax)
                    leftMax = arr[left];
                else
                    water = water + leftMax - arr[left];
                left++;
            } else {
                    if (arr[right] >= rightMax)
                        rightMax = arr[right];
                    else
                        water = water + rightMax - arr[right];
                    right--;
                }
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
