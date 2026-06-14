//Given a string s1 and another string s2. Find the minimum index of the character in s1 that is also present in s2. if no character common in both then return -1.
public class MinimumIndexedCharactergfgBruteforce
{
    public static int minIndexedChar(String s1,String s2)
    {
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);

            for(int j=0;j<s2.length();j++){
                if(ch==s2.charAt(j)){
                    return i;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args)
    {
        String s1="geeksforgeeks";
        String s2="set";
        int ans=minIndexedChar(s1,s2);
        System.out.println(ans);


    }
}
