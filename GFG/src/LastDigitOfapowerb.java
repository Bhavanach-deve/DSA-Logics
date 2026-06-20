//Given two integers a and b in the form of strings. Return the last digit of ab.
public class LastDigitOfapowerb
{
    static int mod(String s, int m) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            res = (res * 10 + (s.charAt(i) - '0')) % m;
        }

        return res;
    }

    static int getLastDigit(String a, String b) {

        if (b.equals("0")) {
            return 1;
        }

        int digit = a.charAt(a.length() - 1) - '0';

        int[][] cycle = {
                {0},
                {1},
                {2, 4, 8, 6},
                {3, 9, 7, 1},
                {4, 6},
                {5},
                {6},
                {7, 9, 3, 1},
                {8, 4, 2, 6},
                {9, 1}
        };

        int len = cycle[digit].length;

        int exponent = mod(b, len);

        if (exponent == 0) {
            exponent = len;
        }

        return cycle[digit][exponent - 1];
    }

    public static void main(String[] args)
    {
        String a="3";
        String b="10";
        System.out.println(getLastDigit(a,b));
    }
}
