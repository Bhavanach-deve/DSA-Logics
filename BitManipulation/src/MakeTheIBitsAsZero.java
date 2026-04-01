import java.util.Scanner;

public class MakeTheIBitsAsZero
{
    public static int makeZeros(int n,int i){
        int result=n&(-1<<i);
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Enter the index till you want to make zeros:");
        int i=sc.nextInt();
        System.out.println("The new number formed is:"+makeZeros(n,i));
    }
}
