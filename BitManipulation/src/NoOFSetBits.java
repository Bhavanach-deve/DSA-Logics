public class NoOFSetBits
{
    public static void main(String[] args)
    {
        int n=15;
        int count=0;
        while(n>0){
            int rem=n%2;
            count=count+rem;
            n=n/2;
            System.out.println(n);
        }
        System.out.println("The number of set bits are: "+count);
    }
}
