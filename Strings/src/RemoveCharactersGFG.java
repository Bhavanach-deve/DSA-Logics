//Given two strings str1 and str2, remove those characters from the first string(str1) which are present in the second string(str2). Both the strings are different and contain only lowercase characters.
//NOTE: Size of the first string is always greater than the size of the second string( |str1| > |str2|).
class RemovingChar{
    public String removing(String s1, String s2)
    {
        int n=s1.length();
        int m=s2.length();
        boolean remove[]=new boolean[26];
        for(int i=0;i<m;i++){
            remove[s2.charAt(i)-'a']=true;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s1.charAt(i);

            if(!remove[ch-'a']){
                ans.append(ch);
            }
        }
        return ans.toString();

    }
}
public class RemoveCharactersGFG
{
    public static void main()
    {
        RemovingChar r=new RemovingChar();
        String s1="occurrence";
        String s2="car";
        String ans=r.removing(s1,s2);
        System.out.println(ans);
    }
}
