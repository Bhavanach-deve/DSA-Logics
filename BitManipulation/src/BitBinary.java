public class BitBinary
{
    public static boolean isPalindromeBinary(int n)
    {
        String binary=Integer.toBinaryString(n);

        int i=0,j=binary.length()-1;

        while(i<j)
        {
            if(binary.charAt(i)==binary.charAt(j)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int n=17;

        System.out.println(isPalindromeBinary(n));

    }
}
