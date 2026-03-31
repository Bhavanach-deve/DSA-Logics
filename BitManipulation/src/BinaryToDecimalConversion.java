import java.util.Scanner;

public class BinaryToDecimalConversion
{
    static int getNo(int x,int y){
        int firstNo=1<<x;
        int secondNo=1<<y;
        System.out.println(firstNo+" "+secondNo);
        return firstNo|secondNo;
    }
    public static void main(String[] args)
    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a binary number: ");
//        int binary=sc.nextInt();
//        int decimal=0;
//        int power=0;
//        while(binary>0){
//            int lastDigit=binary%10;
//            if(lastDigit==1){
//                decimal=decimal+(1<<power);
//            }
//            power++;
//            binary=binary/10;
//
//        }
//        System.out.println("Decimal equivalent is: "+decimal);

        System.out.println(getNo(3,1));
    }
}
