import java.util.Scanner;

public class A7KadanesAlgorithm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an Array");
        int n=sc.nextInt();
        System.out.println("Enter elements of an Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < arr.length; i++) {
            currentSum=currentSum+ arr[i];

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

            if(currentSum < 0) {
                currentSum = 0; // reset
            }
        }
        System.out.println(maxSum);

    }
}
