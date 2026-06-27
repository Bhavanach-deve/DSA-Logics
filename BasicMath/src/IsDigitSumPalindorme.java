//Given a number n. Return true if the digit sum(or sum of digits) of n is a Palindrome number otherwise false.
public class IsDigitSumPalindorme
{
    public static boolean ispalindromeSum(int n)
    {
        int sum=0;
        int temp=n;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        int original=sum;
        int reverse=0;

        while(sum>0){
            reverse=reverse*10+(sum%10);
            sum/=10;
        }
        return original==reverse;
    }

    public static void main(String[] args)
    {
        int n=56;
        System.out.println(ispalindromeSum(n));

    }
}
