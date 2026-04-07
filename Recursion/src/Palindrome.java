public class Palindrome
{
    public static boolean palindrome(String s,int i,int j)
    {
        //baseCase
        if(i>=j)
        {
            return true;
        }
        //check characters
        if((s.charAt(i)!=s.charAt(j)))
        {
            return false;
        }
        //recursive call
        return palindrome(s,i+1,j-1);
    }
    public static void main(String[] args) {
        String s="racecar";
        boolean result=palindrome(s,0,s.length()-1);
        System.out.println(result);

    }
}
