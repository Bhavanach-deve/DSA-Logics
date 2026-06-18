//Given a string s as input. Delete the characters at odd indices of the string. Return the final string after deletion of characters at odd indices.
public class DeleteAlternateCharactersGFG
{
    public static String delete(String s)
    {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0)
            {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args)
    {
        String s="Geeks";
        System.out.println(delete(s));

    }
}
