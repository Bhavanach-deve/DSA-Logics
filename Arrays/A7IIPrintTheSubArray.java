import java.util.Scanner;

public class A7IIPrintTheSubArray
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an Array");
        int n=sc.nextInt();
        System.out.println("Enter elements of an Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        int start = 0, end = 0, tempStart = 0;

        for(int i = 0; i < arr.length; i++){
            currentSum += arr[i];

            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if(currentSum < 0){
                currentSum = 0;
                tempStart = i + 1;
            }
        }
        System.out.println("Maximum Sum: " + maxSum);
        System.out.println("Subarray indices: " + start + " to " + end);

        System.out.print("Subarray: ");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
