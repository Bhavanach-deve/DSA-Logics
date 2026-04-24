import java.util.Stack;

public class ScoreOfParentheses
{
    public static int scoreOfParentheses(String s){
        Stack<Integer>st=new Stack<>();

        int score=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                st.push(score);
                score=0;
            }else{
                score=st.pop()+Math.max(2*score,1); //Inside score = 0
                //Then:
                //Math.max(2*0,1)
                        //= Math.max(0,1)
                        //= 1
            }
        }
        return score;
    }
    public static void main(String[] args)
    {
        System.out.println(scoreOfParentheses("(()(()))"));

    }
}
