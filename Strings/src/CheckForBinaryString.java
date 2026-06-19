//Given a non-empty sequence of characters s, return true if sequence is Binary, else return false.
public class CheckForBinaryString
{
    public static boolean isBinary(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='1' && s.charAt(i)!='0'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s="21";
        System.out.println(isBinary(s));

    }
}
