//Given a string of length N, made up of only uppercase characters 'R' and 'G', where 'R' stands for Red and 'G' stands for Green.Find out the minimum number of characters you need to change to make the whole string of the same colour.
public class RedOrGreen
{
public static int RedOrGreen(int N, String S)
{
    int red=0;
    int green=0;
    for(int i=0;i<S.length();i++){
        if(S.charAt(i)=='R') {
            red++;
        }else{
            green++;
        }
    }
    return Math.min(red,green);
}

public static void main(String[] args)
{
    String s="GGGGGGR";
    System.out.println(RedOrGreen(7,s));

}
}