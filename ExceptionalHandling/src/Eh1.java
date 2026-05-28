//Given two integers a and b. Find the minimum value of a $ b where $ is any arithmetic operation like multiply( * ), Divide( / ), Addition( + ), Substraction( - ).
//Note: Use Exception Handling in this problem.
public class Eh1
{
    public static int findMin(int a, int b){
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int ans=Math.min(add,Math.min(sub,mul));

        try{
            int div=a/b;
            ans=Math.min(ans,div);
        }
        catch(ArithmeticException e){
            System.out.println("Please enter a non-zero number");
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int res=findMin(5,-5);
        System.out.println(res);
    }

}
