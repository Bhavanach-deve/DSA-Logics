public class PalindromeBinaryNumber
{
    public static boolean isPalindrome(int n)
    {
        int left=31;

        //Find no.of bits
        //Keep moving left pointer down
        //until you find the first 1
        while(((n>>left)&1)==0 && left>0)
        {
            left--;
        }
        int right=0;

        while(left>right)
        {
            int leftBit=(n>>left)&1;
            int rightBit=(n>>right)&1;

            if(leftBit!=rightBit)
                return false;
            left--;
            right++;
        }
        return true;

    }
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(17));
        System.out.println(isPalindrome(2));
        System.out.println(isPalindrome(8));
    }
}
