//Given two strings s1 and s2 which are of lengths n and n+1. The second string contains all the character of the first string, but there is one extra character. Your task to find the extra character in the second string and return it.
public class FindOneExtraCharacter
{
    public static char extraChar(String s1,String s2)
    {
        char result=0;
        for(int i=0;i<s1.length();i++){
            result^=s1.charAt(i);
        }
        for(int j=0;j<s2.length();j++){
            result^=s2.charAt(j);
        }
        return result;
    }

    public static void main(String[] args)
    {
        String s1="abcd";
        String s2="badce";
        System.out.println(extraChar(s1,s2));
    }
}
