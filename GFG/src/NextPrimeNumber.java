//Given an integer n. Write a program to find the first prime number greater than n.
//Examples:
//Input: n = 15
//Output: 17
//Explanation: 17 is next prime number.
//Input: n = 7
//Output: 11
//Explanation: 11 is the prime number next to 7.
public class NextPrimeNumber
{
    public static int nextPrime(int n)
    {
        int num=n+1;
        while(true){
            if(isPrime(num)){
                return num;
            }
            num++;
        }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(nextPrime(7));
        System.out.println(nextPrime(15));


    }
}
