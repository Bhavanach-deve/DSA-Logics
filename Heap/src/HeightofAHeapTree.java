//Given a Binary Heap of size n in an array arr[]. Write a program to calculate the height of the Heap.
public class HeightofAHeapTree {
    public static int heapHeight(int arr[], int n) {

        if(n==1){
            return 1;
        }
        int height = -1;

        while (n > 0) {
            height++;
            n /= 2;
        }

        return height;
    }

    public static void main(String[] args)
    {
        int arr[]={1,3,6,5,9,8};
        int n=6;
        System.out.println(heapHeight(arr,n));

    }
}

