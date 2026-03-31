import java.util.Scanner;

public class FindBitAtIthIndex
{
    public static int fetch(int n,int i){
        return (n>>i)&1;
    }
    public static int fetchBit(int n,int i){
        int result=n&(1<<i); //moves the value "1" by "i" times to left
        if(result>0) {
            return 1;
        }
        return 0;
    }


    static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      System.out.println("Enter the index to fetch the value present at:");
      int i=sc.nextInt();

        System.out.println("The result when used right shift: "+fetch(n,i));
        System.out.println("The result when used left shift: "+fetchBit(n,i));
    }
}
