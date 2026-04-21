import java.util.*;
public class RemoveAllAdjacentDuplicates
{
    public static String removeDuplicate(String str){
        Stack<Character>stack=new Stack<>();

        for(char ch:str.toCharArray()){
            //If top is same, remove it
            if(!stack.isEmpty()&&stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        //Build result
        StringBuilder result=new StringBuilder();

        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args)
    {
        String str="azbbzc";
        System.out.println(removeDuplicate(str));

    }
}
