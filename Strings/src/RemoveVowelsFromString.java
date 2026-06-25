public class RemoveVowelsFromString
{
    public static String vowelsRemoval(String s){
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != 'a' && ch != 'e' &&
                    ch != 'i' && ch != 'o' &&
                    ch != 'u') {

                ans.append(ch);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args)
    {
        String s="Hello World!";
        System.out.println(vowelsRemoval(s));

    }

}
