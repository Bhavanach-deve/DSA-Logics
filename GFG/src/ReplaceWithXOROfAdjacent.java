import java.util.ArrayList;

public class ReplaceWithXOROfAdjacent {
    public static void replace(int arr[]) {
        int n = arr.length;
        int temp []=new int[n];

        temp[0]=arr[0]^arr[1];

        for(int i=1;i<n-1;i++)
        {
            temp[i]=arr[i-1]^arr[i+1];
        }
        temp[n-1]=arr[n-2]^arr[n-1];

        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args)
    {
        int ans[]={2,1,4,7};
        replace(ans);

        for(int res:ans){
            System.out.print(res+" ");
        }

    }
}
