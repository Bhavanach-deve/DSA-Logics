class FactSum{
    public int factorSum(int N){
        int sum=0;
        for(int i=1;i*i<=N;i++){
            if(N%i==0){
                sum=sum+i;

                if(i!=N/i){
                    sum=sum+(N/i);
                }
            }
        }
        return sum;
    }
}
public class FactorsSum
{
    public static void main(String[] args)
    {
        int N=30;
        FactSum factors=new FactSum();
        int result=factors.factorSum(N);
        System.out.println("The sum of factors of the number "+N+" is: "+result);

    }
}
