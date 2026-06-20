//Given a string, check if all its characters are the same or not.
public class CheckString
{
    public static boolean checkCharacter(String s)
    {
        int l=0;
        int r=s.length()-1;
        while(l<r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            r--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String s="iiii";
        System.out.println(checkCharacter(s));

    }
}
