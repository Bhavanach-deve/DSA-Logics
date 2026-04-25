import java.util.Stack;

public class MinimumDeletionsToMakeStringBalanced
{
    public static int minDeletion(String s){
        int n=s.length();
        Stack <Character> st = new Stack<>();
        int deletions=0;
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && st.peek()=='b' && s.charAt(i)=='a'){
                st.pop();
                deletions++;
            }
            else{
                st.push(s.charAt(i));
            }
        }
        return deletions;
    }
    public static void main(String[] args)
   {
       String s="bbaaaabb";
       System.out.println(minDeletion(s));//always put 'a'first then followed by 'b'.

    }
}
