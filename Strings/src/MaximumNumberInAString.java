//Given an alphanumeric string s consisting of lowercase letters (a–z), uppercase letters (A–Z), and digits (0–9).
//Extract all numeric substrings from s and return the maximum numeric value among them.
//If no numeric substring exists, return -1.
public class MaximumNumberInAString
{
    public static int extractMaximum(String s)
    {
        int max=-1;
        StringBuilder num=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num.append(ch);
            }else{
                if(num.length()>0){
                    max=Math.max(max,Integer.parseInt(num.toString()));
                    num.setLength(0);
                }
            }
        }
        if(num.length()>0){
            max=Math.max(max,Integer.parseInt(num.toString()));
        }
        return max;

    }

    public static void main(String[] args)
    {
        String s="100klh564abc365bg";
        System.out.println(extractMaximum(s));

    }
}
