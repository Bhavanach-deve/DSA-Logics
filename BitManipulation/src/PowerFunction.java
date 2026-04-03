import java.util.Scanner;

public class PowerFunction
{
    public static int power(int n,int p){
        int output=1;

        while(p>0){
            int lastBit=p&1;
            if(lastBit==1){
                output=output*n;
            }
            n=n*n;
            p=p>>1;
        }
        return output;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base: ");
        int n=sc.nextInt();
        System.out.println("Enter the power: ");
        int p=sc.nextInt();
        System.out.println("The calculation for the power function is:"+power(n,p));

    }
}
