import java.util.Scanner;

public class A9EquilibriumIndexUsingPrefix
{
   static int equilibriumIndex(int arr[], int n) {
        int prefix[] = new int[n];

        prefix[0] = arr[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i-1];
            int rightSum = prefix[n-1] - prefix[i];

            if(leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result=equilibriumIndex(arr,n);
        System.out.println("The equilibrium index is:"+result);

    }
}
