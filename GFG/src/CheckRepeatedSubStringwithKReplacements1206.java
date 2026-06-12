//Given a string s and an integer k, check if it is possible to convert s to a string that is repetition of a substring with k characters else returns false. In order to convert we can replace one substring of length k with any k characters.
import java.util.HashMap;

public class CheckRepeatedSubStringwithKReplacements1206
{
    public static boolean ksubString(int k, String s){
        int n=s.length();
        if(n%k!=0){
            return false;
        }
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i+=k){
            String block=s.substring(i,i+k);
            map.put(block, map.getOrDefault(block,0)+1);
        }
        if(map.size()==1){
            return true;
        }
        if(map.size()>2){
            return false;
        }
        for(int freq:map.values()){
            if(freq==1){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args)
    {
        String s="abcbedabcabc";
        boolean status=ksubString(3,s);
        System.out.print(status);

    }
}
