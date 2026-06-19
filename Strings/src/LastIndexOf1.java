//Given a string s consisting of only '0's and '1's,  find the last index of the '1' present.
//Note: If '1' is not present, return "-1"
public class LastIndexOf1
{
    public static int lastIndex(String s)
    {
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='1'){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args)
    {
        String s="10001";
        System.out.println(lastIndex(s));


    }
}
