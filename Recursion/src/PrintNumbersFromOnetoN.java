//to print numbers from 1 to N
public class PrintNumbersFromOnetoN
{
    public static void printing(int n){
        //base case
        if(n==0)
            return;


        //recursive case
        printing(n-1);//recursion will solve for n-1
        System.out.println(n);//I will just solve this

    }

    public static void main(String[] args)
    {
        printing(7);
    }
}
