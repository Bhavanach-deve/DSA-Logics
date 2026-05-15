public class GetLPSLengthBruteForce
{
    public static int getlpsLength(String s)
    {
        int res=0;
        int n=s.length();

        for(int len=1;len<n;len++){
            int j=s.length()-len;
            boolean flag=true;

            for(int k=0;k<len;k++){
                if(s.charAt(k)!=s.charAt(j+k)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                res=len;
            }

        }
        return res;
    }

    public static void main(String[] args)
    {
        String s="ababab";
        System.out.println(getlpsLength(s));
    }

}
