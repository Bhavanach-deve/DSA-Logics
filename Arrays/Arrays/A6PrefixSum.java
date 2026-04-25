public class A6PrefixSum
{
    public static void main(String[] args) {

        int arr[]={8,5,3,2,6};
        int n=arr.length;

        int prefix[]=new int[n];

        prefix[0]=arr[0];

        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        int L=1,R=3;
        int sum;
        if(L==0)
            sum=prefix[R];
        else
            sum=prefix[R]-prefix[L-1];

        System.out.println(sum);
    }

}
