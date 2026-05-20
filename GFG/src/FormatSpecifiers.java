//There are times when your answer is a floating point that contains undesired amount of digits after decimal.
//Here, we'll learn how to get a precise answer out of a floating number. You are given two floating numbers a and b.
//You need to print the value of a/b rounded to exactly 3 decimal places.
//You need to print the result (return type is void) without any newline or space around it.
public class FormatSpecifiers
{
    public static void precise(float a,float b){
        double result=a/b;
        System.out.printf("%.3f",result);
    }

    public static void main(String[] args)
    {
        float a= 5.43f;
        float b=2.653f;
        precise(a,b);

    }

}
