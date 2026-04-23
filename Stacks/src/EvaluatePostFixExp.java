import java.util.Stack;

public class EvaluatePostFixExp
{
    public static void main(String[] args)
    {
        System.out.println(evaluateExp("2536+**5/2-"));
    }
    private static int evaluateExp(String exp){
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<exp.length();i++){
          char c=exp.charAt(i);

          if(Character.isDigit(c)){
              st.push(c-'0');
          }
          else{
              int op2=st.pop();
              int op1=st.pop();

              switch(c){
                  case '+':
                  st.push(op1+op2);
                  break;
                  case '-':
                      st.push(op1-op2);
                      break;
                  case '/':
                      st.push(op1/op2);
                      break;
                  case '*':
                      st.push(op1*op2);
                      break;

              }

          }
        }
        return st.pop();

    }
}
