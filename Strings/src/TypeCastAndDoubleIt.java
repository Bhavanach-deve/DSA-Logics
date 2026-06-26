//Given an input num as a string. You need to typecast into an integer and double it.
import java.util.Scanner;

public class TypeCastAndDoubleIt
{
    public static int typecast(String num){
        int n=Integer.parseInt(num);
        return n*2;
    }

    public static void main(String[] args)
    {
        System.out.println(typecast("5"));

    }
}
