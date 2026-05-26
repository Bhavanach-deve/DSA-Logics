//Given a number n find the prime factorization of the number.
//Note: Print the prime factors in non-decreasing order.
public class PrimeFactorization
{
    public static void printPrimeFactorization(int n){
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        printPrimeFactorization(100);

    }
}
