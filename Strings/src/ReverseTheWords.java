import java.util.*;

public class ReverseTheWords
{
    public static void main(String[] args) {
        String str = "I love Java";
        char[] arr = str.toCharArray();
        int n = arr.length;
        reverse(arr, 0, n - 1);
        int start = 0;
        for (int end = 0; end <= n; end++)
        {
            if(end==n||arr[end]==' '){
                reverse(arr,start,end-1);
                start=end+1;
            }
        }
        System.out.println(new String(arr));
    }
    public static void reverse(char[]arr,int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
