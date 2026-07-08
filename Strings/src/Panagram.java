//Given a string s, check if it is a "Panagram" or not.  A "Panagram" is a sentence containing every letter in the English Alphabet either in lowercase or Uppercase
public class Panagram
{
    public static boolean panagramCheck(String s)
    {
       boolean[]seen=new boolean[26];
       int count=0;

       for(int i=0;i<s.length();i++){
           char ch=Character.toLowerCase(s.charAt(i));

           if(ch>='a'&& ch<='z'){

               if(!seen[ch-'a'])
               {
                   seen[ch-'a']=true;
                   count++;
               }
           }
       }
       return count==26;
    }
    public static void main(String[] args)
    {
        String s="Bawds jog, flick quartz, vex nymph";
        System.out.println(panagramCheck(s));

    }
}
