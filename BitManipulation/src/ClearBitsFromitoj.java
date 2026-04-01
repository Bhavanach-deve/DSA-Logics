import java.util.Scanner;

public class ClearBitsFromitoj
{
    public static int clear(int n,int i,int j){
        int a=(-1<<j);
        int b=(1<<i)-1;
        int mask=(a|b);
        int result=n&(mask);
        return result;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Enter the 1st index value:");
        int i=sc.nextInt();
        System.out.println("Enter the 2nd index value:");
        int j=sc.nextInt();
        System.out.println("The number after making zeros is:"+clear(n,i,j));
    }
}
