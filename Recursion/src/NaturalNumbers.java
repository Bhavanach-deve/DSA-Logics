public class NaturalNumbers
{
    public static int sumOfnatural(int n){
        //basecase
        if(n==1)
            return 1;
        //recursive
        return n+sumOfnatural(n-1);
    }
    public static void main(String[] args)
    {
        System.out.println(sumOfnatural(11));
    }
}
