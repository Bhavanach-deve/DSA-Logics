public class LCMAndGCD
{
    public static int[]findLCM(int a,int b){
        int findgcd=gcd(a,b);
        int lcm=(a*b)/findgcd;

        return new int[]{lcm,findgcd};
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public static void main(String[] args)
    {
        int result[]=findLCM(2,4);
        System.out.println("The LCM and GCD of the given two numbers is: "+result[0]+" "+result[1]);

    }
}
