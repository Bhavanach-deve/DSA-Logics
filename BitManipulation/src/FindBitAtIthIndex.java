import java.util.Scanner;

public class FindBitAtIthIndex
{
    public static int fetch(int n,int i){
        return (n>>i)&1;
    }

    static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      System.out.println("Enter the index to fetch the value present at:");
      int i=sc.nextInt();

        System.out.println(fetch(n,i));
    }
}
