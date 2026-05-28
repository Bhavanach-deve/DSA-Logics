import java.util.Arrays;

public class Anagram
{
    public static int areAnagram(String S1,String S2){
        if(S1.length()!=S2.length())
            return 0;

        char a[]=S1.toCharArray();
        char b[]=S2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
            return 1;
        return 0;
    }

    public static void main(String[] args)
    {
        String s1="jaav";
        String s2="java";
        System.out.println(areAnagram(s1,s2));

    }
}
