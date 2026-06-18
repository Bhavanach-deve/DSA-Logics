//Given a string s, the task is to create a string with the first letter of every word in the string. The string s contains lower case English alphabets and its words have a single space between them.
public class FirstLetterOfEveryWord
{
    public static String firstAlpha(String s)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==' '){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }

   public static void main(String[] args)
   {
       String s="geeks for geeks";
       System.out.println(firstAlpha(s));

    }
}
