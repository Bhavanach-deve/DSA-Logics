//Sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number is a magic number'
public class MagicNumber1
{
    public static int isMagic(int n)
    {
        //base case
        if(n<10)
            return n;
        int sum=0;
        //sum of digits
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        //recursive call
        return isMagic(sum);
    }
    public static void main(String[] args)
    {
        int n=83557;
        int result=isMagic(n);
        if(result==1)
            System.out.println("Magic Number!");
        else
            System.out.println("Not a Magic Number");

    }
}
