import java.util.Scanner;

public class SetiThBit
{
    public static int setBit(int n,int i){
        int result=n|(1<<i);
        System.out.println("The new number formed after setting the bit is: ");
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the index which you want to set: ");
        int i=sc.nextInt();
        System.out.println("Setting bit at index "+i);
        System.out.println(setBit(n,i));

    }
}
