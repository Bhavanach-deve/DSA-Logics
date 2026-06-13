//You are given two strings s1 and s2, of equal lengths. The task is to check if s2 is a rotated version of the string s1.
public class StringRotation
{
    public static boolean rotations(String s1,String s2)
    {
       if(s1.length()!=s2.length())
           return false;
       String temp=s1+s1;

       return temp.contains(s2);
    }

    public static void main(String[] args)
    {
        String s1="abcd";
        String s2="acbd";
        boolean status=rotations(s1,s2);
        System.out.println(status);

    }
}

