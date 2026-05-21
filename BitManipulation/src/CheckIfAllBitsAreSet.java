//Given a number n, check whether every bit in the binary representation of the given number is set or not.
//Return true if yes, otherwise false.
public class CheckIfAllBitsAreSet
{
    public static boolean setBits(int n){
        if(n==0)
            return false;
        return (n&(n+1))==0;
    }

    public static void main(String[] args)
    {
        System.out.println(setBits(7));
        System.out.println(setBits(15));
        System.out.println(setBits(4));


    }
}
