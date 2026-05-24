//You are given a positive integer n, you need to add all the digits of n and create a new number. Perform this operation until the resultant number has only one digit in it. Return the final number obtained after performing the given operation.
public class RepetitiveAdditionOfDigits {
    public static int add(int n) {

        while (n > 9) {

            int sum = 0;

            while (n > 0) {

                int digit = n % 10;

                sum = sum + digit;

                n = n / 10;
            }

            n = sum;
        }

        return n;
    }
    public static void main(String args[]){
        int n=1234;
        System.out.println(add(n));
    }
}