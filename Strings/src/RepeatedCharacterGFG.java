//Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.
//NOTE - If there are no repeating characters return '#'.
public class RepeatedCharacterGFG
{
    public static char firstRep(String s)
    {
        int n=s.length();
        int temp[]=new int[26];
        for(int i=0;i<n;i++) {
            temp[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(temp[s.charAt(i)-'a']>1){
                return s.charAt(i);
            }
        }
        return '#';
    }

    public static void main(String[] args)
    {
        String s="geeksforgeeks";
        System.out.println(firstRep(s));

    }
}
