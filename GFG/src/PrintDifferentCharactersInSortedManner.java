//Given a string s, return a string with all distinct characters from the given string in sorted order (non-decreasing), without using any sorting algorithm.
public class PrintDifferentCharactersInSortedManner
{
    public static String distinctSortedChar(String s)
    {
        int freq[]=new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                ans.append((char)i);
            }
        }
        return ans.toString();
        }

    public static void main(String[] args)
    {
        System.out.println(distinctSortedChar("ab"));


    }
}
