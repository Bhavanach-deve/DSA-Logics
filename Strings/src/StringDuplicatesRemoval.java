//Given a string s which may contain lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.
import java.util.HashSet;

public class StringDuplicatesRemoval
{
    public static String duplicate(String s)
    {
        HashSet<Character>set=new HashSet<>();
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args)
    {
        String s="geEksforGEeks";
        String ans=duplicate(s);
        System.out.println(ans);

    }
}
