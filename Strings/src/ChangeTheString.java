//Given a string s, the task is to change the complete string to uppercase or lowercase depending on the case of the first character.
public class ChangeTheString
{
    public static String transform(String s){
        char first=s.charAt(0);
        if(first>='a' && first<='z'){
            return s.toLowerCase();
        }
        return s.toUpperCase();
    }


    public static void main(String[] args)
    {
        String s="Bhavana";
        System.out.println(transform(s));
    }
}
