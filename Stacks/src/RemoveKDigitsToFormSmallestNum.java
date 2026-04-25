import java.util.Stack;

public class RemoveKDigitsToFormSmallestNum
{
    public static String removeKdigits(String num,int k){
        Stack<Character>st=new Stack<>();

        for(char digit:num.toCharArray()){
            while(!st.isEmpty()&&k>0&&st.peek()>digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        for(int i=0;i<k;i++){
            st.pop();
        }
        StringBuilder sb=new StringBuilder();
        boolean leadingZero=true;

        for(char digit:st){
            if(leadingZero&&digit=='0')continue;
            leadingZero=false;
            sb.append(digit);
        }
        if(sb.length()==0)
            return "0";
        return sb.toString();
    }

   public static void main(String[] args)
   {
       String str="12345264";
       int k=4;
       System.out.println(removeKdigits(str,k));

    }
}
