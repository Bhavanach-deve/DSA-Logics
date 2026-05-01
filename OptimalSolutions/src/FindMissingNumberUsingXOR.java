public class FindMissingNumberUsingXOR
{
    public static int missing(int arr[]){
        int n=arr.length+1;
        int xor1=0;
        int xor2=0;

        for(int i=1;i<=n;i++){
            xor1=xor1^i;
        }
        for(int nums:arr){
            xor2=xor2^nums;
        }
        return xor2^xor1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(missing(arr));

    }
}
