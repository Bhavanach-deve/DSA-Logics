import java.util.Scanner;

public class BinaryToDecimalConversion
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binary=sc.nextInt();
        int decimal=0;
        int power=0;
        while(binary>0){
            int lastDigit=binary%10;
            if(lastDigit==1){
                decimal=decimal+(1<<power);
            }
            power++;
            binary=binary/10;

        }
        System.out.println("Decimal equivalent is: "+decimal);
    }
}
