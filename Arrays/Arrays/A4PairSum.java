import java.util.Scanner;

public class A4PairSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of an array:");
        int arr[]=new int[n];
        int left=0;
        int right=n-1;
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to check for the pair sum in the array");
        int target=sc.nextInt();
        while(left<right){
            sum=arr[left]+arr[right];

            if(sum==target){
                System.out.println("Pair:"+arr[left]+","+arr[right]);
                left++;
                right--;
            }
            else if(sum<target){
                left++;
            }
            else {
                right--;
            }
        }

    }
}
