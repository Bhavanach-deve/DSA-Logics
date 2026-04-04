import java.util.Scanner;

public class ReverseAString
{
    public static void reverse(char[]ch,int i,int j){
        if(i>=j)
            return;
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        reverse(ch,i+1,j-1);
    }
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       char[]ch=s.toCharArray();
       reverse(ch,0,ch.length-1);
       System.out.println("Reversed string: "+new String(ch));


   }
}
