//Given a string s consisting of n lowercase characters. Return the lexicographically smallest string after removing exactly k characters from the string. But you have to correct the value of k, i.e., if the length of the string is a power of 2, reduce k by half, else multiply k by 2. You can remove any k characters.
//Note: If it is not possible to remove k (the value of k after correction) characters or if the resulting string is empty return -1.
import java.util.Stack;

public class LexicographicallySmallestAfterRemovingk
{
    public static String lexicographicallySmallest(String s, int k) {
        int n = s.length();
        if ((n & (n - 1)) == 0) {
            k = k / 2;
        } else {
            k = k*2;
        }
        if(k>=n){
            return "-1";
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            while(!st.isEmpty() && st.peek()>ch && k>0){
                st.pop();
                k--;
        }
            st.push(ch);
        }
        //  If removals remain, remove from end
        while(k>0&&!st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        if(sb.length()==0){
            return "-1";
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        String s="fooland";
        int k=2;
        String ans=lexicographicallySmallest(s,k);
        System.out.print(ans);

    }
}
