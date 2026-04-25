import java.util.Scanner;

public class A11SlidingWindow
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the elements:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the window:");
        int k=sc.nextInt();
        //First Window sum
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];

        }
        System.out.println(sum);
        //Second window sum
        for(int i=k;i<n;i++){
            sum=sum+arr[i];
            sum=sum-arr[i-k];
            System.out.println(sum);
        }
    }
}
