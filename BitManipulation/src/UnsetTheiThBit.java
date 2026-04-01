import java.util.Scanner;

public class UnsetTheiThBit
{
    public static int unset(int n,int i){
        int result=n&~(1<<i);
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Enter the index you want to Unset:");
        int i=sc.nextInt();
        System.out.println("The new number after unsetting the i-th bit is:"+unset(n,i));

    }
}
