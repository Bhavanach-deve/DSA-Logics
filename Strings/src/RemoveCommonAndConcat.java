//Given two strings, s1 and s2. The task is to remove all characters that are common in both strings and then combine the remaining characters from each string to form a new string. The characters that are not shared between the two strings should appear in the result in the same order as they appear in their respective original strings. If, after removing the common characters, no characters are left to form the result, return "-1"
public class RemoveCommonAndConcat
{
    public static String uncommonConcat(String s1,String s2)
    {
        boolean str1[]=new boolean[26];
        boolean str2[]=new boolean[26];
        for(int i=0;i<s1.length();i++){
            str1[s1.charAt(i)-'a']=true;
        }
        for(int i=0;i<s2.length();i++){
            str2[s2.charAt(i)-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);

            if(!str2[ch-'a']){
                sb.append(ch);
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(!str1[ch-'a']){
                sb.append(ch);
            }
        }
        return sb.length() == 0 ? "-1" : sb.toString();
    }

    public static void main(String[] args)
    {
        String s1="aacdb";
        String s2="gafd";
        System.out.println(uncommonConcat(s1,s2));

    }
}
