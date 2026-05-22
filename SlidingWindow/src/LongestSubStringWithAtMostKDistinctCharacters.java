import java.util.HashMap;

public class LongestSubStringWithAtMostKDistinctCharacters
{
    public static int longestSubString(String s,int k){
        HashMap<Character,Integer>map=new HashMap<>();
        int l=0;
        int maxLen=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()>k){
                char charleft=s.charAt(l);
                map.put(charleft,map.get(charleft)-1);
                if(map.get(charleft)==0){
                    map.remove(charleft);
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }

    public static void main(String[] args)
    {
        String s="eceba";
        int k=2;
        System.out.println(longestSubString(s,k));

    }
}
