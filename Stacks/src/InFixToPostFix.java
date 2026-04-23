import java.util.Stack;

public class InFixToPostFix
{
    public static void main(String[] args)
    {
        System.out.println(infixToPostFix("K+L-M*N+(O^P)"));

    }

    public static int precedence(char c){
        if(c=='^'){
            return 3;

        }else if(c=='*'||c=='/'){
            return 2;

        }else if(c=='+'||c=='-'){
            return 1;
        }else{
            return 0;
        }
    }
    public static boolean isOperand(char c)
    {
        if((c>='a' && c<='z')||(c>='A' && c<='Z')||(c>='0' && c<='9')){
            return true;
        }
        return false;
    }
    public static String infixToPostFix(String exp){
        String postfix=new String("");

        Stack<Character> st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);

            if(isOperand(c))
            {
                postfix=postfix+c;
            }
            else if(c=='(')
            {
                st.push(c);

            }else if(c==')'){
                while(st.peek()!='('){
                    postfix=postfix+st.pop();
                }

            }else{
                while(!st.isEmpty() && precedence(c)<=precedence(st.peek())){
                    postfix=postfix+st.pop();
                }
                st.push(c);

            }
        }
        while(!st.empty()){
            postfix=postfix+st.pop();
        }
        return postfix;
    }
}
