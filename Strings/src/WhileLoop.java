//Given a number x, the task is to print the numbers from x to 0 in decreasing order in a single line.

public class WhileLoop
{
    public static void utility(int x)
    {
        while(x>=0)
        {
            System.out.print(x--+" ");
        }

    }

    public static void main(String[] args)
    {
        utility(3);

    }
}
