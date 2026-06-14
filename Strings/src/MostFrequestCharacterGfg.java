//Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.
public class MostFrequestCharacterGfg
{
    public static char mostOccured(String s){
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        int max=0;
        char ans='a';
        for(int i=0;i<26;i++){
            if(freq[i]>max) {
                max = freq[i];
                ans = (char) (i + 'a');
            }
        }
        return ans;
    }


    public static void main(String[] args)
    {
        String s="bhavana";
        char ch=mostOccured(s);
        System.out.println(ch);

    }
}
