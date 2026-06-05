//Given a binary string s consisting of 0s and 1s. Find the maximum difference of the number of 0s and the number of 1s (number of 0s – number of 1s) in a substring of the string.
public class SubstringwithMaxZeroOneDiff
{
    public static int maxSubString(String s)
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {

            int val = (s.charAt(i) == '0') ? 1 : -1;

            currSum = Math.max(val, currSum + val);
            maxSum = Math.max(maxSum, currSum);
        }
        return (maxSum<=0)?-1:maxSum;
    }

    public static void main(String[] args)
    {
        String s="11000010001";
        int diff=maxSubString(s);
        System.out.println(diff);

    }
}
