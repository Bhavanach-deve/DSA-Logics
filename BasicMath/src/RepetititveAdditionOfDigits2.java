//repeated digit sum
//single digit reduction
//sum until one digit

//think:
//Digital Root / Mod 9

//A number is divisible by 9 if sum of digits is divisible by 9.

public class RepetititveAdditionOfDigits2
{
    public static int repetitiveAdd(int n){
        if(n==0){
            return n;
        }
        return 1+(n-1)%9;
    }

    public static void main(String[] args)
    {
        System.out.println(repetitiveAdd(1234));

    }
}
