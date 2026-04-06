//Josephus Problem (Adjacent killing)
//Problem:
//People stand in a circle
//Every 2nd person is killed (k = 2)
//Knife passes to next person
//Continue until one survives
import java.util.Scanner;
public class JossephusAlgorithmPuzzle
{
    public static int josephus(int n)
    {
        int power=1;
        while(power*2<=n){
            power=power*2;
        }
        return 2*(n-power)+1;
    }

   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of members in a circle: ");
       int n=sc.nextInt();
       System.out.println("Winner is: "+josephus(n));
    }
}
