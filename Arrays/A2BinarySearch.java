import java.util.Scanner;

public class A2BinarySearch
{
   static int binarySearch(int arr[],int target){
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[n];
        int elements=0;
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int target=sc.nextInt();
        int result=binarySearch(arr,target);
        System.out.println("The element you are searching for is at index: "+result);


    }
}
