import java.util.Scanner;

public class BubbleSort
{
    public static void bubble(int []arr,int n)
    {
        int swap=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr,n);
        System.out.println("Sorted Array: ");
        for(int sorted:arr){
            System.out.println(sorted+" ");
        }

    }
}
