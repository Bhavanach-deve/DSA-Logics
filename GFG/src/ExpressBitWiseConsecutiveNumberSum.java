//A number can be written as sum of consecutive positive numbers iff it is NOT a power of 2.
public class ExpressBitWiseConsecutiveNumberSum
{
    public static boolean SumConsecutive(int n){

        return(n&(n-1))!=0;
    }

    public static void main(String[] args)
    {
        boolean status=SumConsecutive(8);
        System.out.println(status);

    }
}
