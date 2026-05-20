//You are given a String S, you need to print its characters at even indices(index starts at 0).
//Examples:
//Input: s = "Geeks"
//Output: Ges
//Explanation: The even indices (0, 2 & 4) characters are printed.
public class EvenPositionedCharacters
{
    public static void utility(String s) {
        // code here
        for (int i = 0; i < s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args)
    {
        String s="Phenomenal";
        utility(s);

    }

}
