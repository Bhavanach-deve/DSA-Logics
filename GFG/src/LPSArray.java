import java.util.Arrays;

public class LPSArray
{
    static int []lpsArray(String s)
    {
        int n=s.length();
        int[]lps=new int[n];
        int len=0;
        int i=1;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else {
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;

    }

    public static void main(String[] args)
    {
        String s="ababab";
        int[]lps=lpsArray(s);
        System.out.println("LPS Array:"+ Arrays.toString(lps));
        System.out.println("Longest prefix suffix length: "+lps[lps.length-1]);

    }
}
