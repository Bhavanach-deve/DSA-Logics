//You are given two strings s1 and s2. Your task is to identify the characters that appear in either string but not in both (i.e., characters that are unique to one of the strings). Return the result as a sorted string.
public class UncommonCharacters
{
    public static String uncommon(String s1, String s2)
    {
        boolean tempA[]=new boolean[26];
        boolean tempB[]=new boolean[26];
        for(int i=0;i<s1.length();i++){
            tempA[s1.charAt(i)-'a']=true;
        }
        for(int i=0;i<s2.length();i++){
            tempB[s2.charAt(i)-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            if(tempA[i]!=tempB[i]){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        String s1="geeksforgeeks";
        String s2="geeksquiz";
        System.out.println(uncommon(s1,s2));
    }
}
