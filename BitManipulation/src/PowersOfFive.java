import java.util.Scanner;

public class PowersOfFive
{
    public static int magic(int n){
        int result=0;
        int base=5;
        while(n>0){
            if((n&1)==1){
                result=result+base;
            }
            base=base*5;
            n=n>>1;
        }
        return result;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("The magic number is:"+magic(n));
    }
}
