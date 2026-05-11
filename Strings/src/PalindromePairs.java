import java.util.*;
public class PalindromePairs
{
    public static boolean palindromePairs(String[]arr)
    {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {

                if(i!=j) {
                    String s = arr[i] + arr[j];
                    if(isPalindrome(s));
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isPalindrome(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String arr[]={"geekf", "geeks", "or", "keeg", "abc", "bc"};
        Boolean b=PalindromePairs.palindromePairs(arr);
        System.out.println(b);


    }
}
