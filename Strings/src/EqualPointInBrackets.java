//Given a string s of opening and closing brackets '(' and ')' only, find an equal point in the string. An equal point is a position k (0-based) such that the number of opening brackets before position k is equal to the number of closing brackets from position k to the end of the string. If multiple such points exist, return the first valid position.
//The string can be split at any position from 0 to n, where n is the length of the string.
//If we split at 0, it means there is an empty string on left.
//If we split at n, it means there is an empty string on right.
public class EqualPointInBrackets
{
    public static int findIndex(String s)
    {
        int close=0;
        for(char ch:s.toCharArray()){
            if(ch==')'){
                close++;
            }
        }
        int open=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                close --;
            }
            if(open==close){
                return i+1;
            }
        }
        return s.length();
    }

    public static void main(String[] args)
    {
        String s="(())))(";
        int ans=findIndex(s);
        System.out.print(ans);

    }
}
