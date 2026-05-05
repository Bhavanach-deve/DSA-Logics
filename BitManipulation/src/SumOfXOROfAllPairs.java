public class SumOfXOROfAllPairs
{
    public static long sumXOR(int []arr)
    {
        int n=arr.length;
        long sum=0;

        for(int bit=0;bit<32;bit++){
            long countOnes=0;

            for(int num:arr){
                if((num&(1<<bit))!=0)
                countOnes++;
            }

            long countZeros=n-countOnes;
            sum=sum+countOnes*countZeros*(1L<<bit);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int arr[]={7,3,5};
        System.out.println(sumXOR(arr));
    }
}
