//Given an array of positive integers. Your task is to rearrange the array elements alternatively i.e. first element should be the max value, the second should be the min value, the third should be the second max, the fourth should be the second min, and so on.
//Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.
public class RearrangeArrayAlternatelyGFG
{
    public static void rearrange(int arr[])
    {
        int n = arr.length;
        int[] temp = new int[n];

        int left = 0;
        int right = n - 1;
        int idx = 0;

        while (left <= right) {

            temp[idx++] = arr[right--];

            if (left <= right) {
                temp[idx++] = arr[left++];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6};
        rearrange(arr);
        for(int ans:arr){
            System.out.print(ans+" ");
        }

    }
}
