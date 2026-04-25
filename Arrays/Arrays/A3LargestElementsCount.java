import java.util.Scanner;

public class A3LargestElementsCount
{
    public static int largestcount(int arr[],int n){
        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
        }
        return largest;
    }
    public static int counter(int arr[],int n,int largest){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==largest){
                count++;
            }
        }
        return count;
    }
    public static int occurance(int count,int n)
    {

        return n-count;
    }

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
        int large=largestcount(arr,n);
        int count=counter(arr,n,large);
        int occur=occurance(count,n);
        System.out.println("The largest element is:"+large);
        System.out.println("The count of the largest elements is:"+count);
        System.out.println("The occurance of the other elements is:"+occur);


    }
}
