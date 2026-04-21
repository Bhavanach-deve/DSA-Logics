import java.util.*;
public class ValidParenthesis
{
    public static boolean isValid(String str)
    {
        Stack<Character>stack=new Stack<>();
        for(char ch:str.toCharArray()){
            //opening characters push
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            //closing brackets check match
            else if(ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();

                if((ch==')' && top!='(')||(ch=='}' && top!='{')||(ch==']'&& top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        System.out.println(isValid("({[})"));


    }
}
