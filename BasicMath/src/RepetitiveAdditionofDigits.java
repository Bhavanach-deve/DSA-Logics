public class RepetitiveAdditionofDigits
{
    public static int singleDigit(int n)
    {
        if(n<10){
            return n;
        }
        int sum=n;
        while(sum>=10){
            sum=extract(sum);
        }

        return sum;
    }
    public static int extract(int n){
        int rem=0;
        while(n>=1)
        {
            rem=rem+n%10;

            n=n/10;

        }
        return rem;
    }


    public static void main(String[] args)
    {
        int n=1234;
        System.out.println(singleDigit(n));

    }
}
