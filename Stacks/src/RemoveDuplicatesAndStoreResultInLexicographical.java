import java.util.*;
public class RemoveDuplicatesAndStoreResultInLexicographical
{
    public static String removeDuplicateLetters(String s)
    {
        HashMap<Character,Integer>occurance=new HashMap<>();

        HashSet<Character>set=new HashSet<>();

        Stack<Character>stack=new Stack<>();

        //Count Frequency
        for(char ch:s.toCharArray()){
            occurance.put(ch,occurance.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray()){
            //reduce current char count
            occurance.put(ch,occurance.get(ch)-1);
            //if already in result skip
            if(set.contains(ch)){
                continue;
            }
            //remove bigger chars if they come latter
            while(!stack.isEmpty() && stack.peek()>ch && occurance.get(stack.peek())>0){
                set.remove(stack.pop());

            }
            stack.push(ch);
            set.add(ch);
        }
        StringBuilder result=new StringBuilder();
        for(char ch: stack){
            result.append(ch);
        }
        return result.toString();
    }


    public static void main(String[] args)
    {
        System.out.println(removeDuplicateLetters("bcabc"));
        System.out.println(removeDuplicateLetters("cbacdcbc"));


    }
}
