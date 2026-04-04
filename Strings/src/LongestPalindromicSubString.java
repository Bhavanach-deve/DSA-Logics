import java.util.Scanner;

public class LongestPalindromicSubString
{
    public static int expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
    public static int longestPalindromeLength(String s){
        int maxLen=0;

        for(int i=0;i<s.length();i++){
            //odd length palindrome

            int len1=expand(s,i,i);

            //Even length
            int len2=expand(s,i,i+1);

            int curMax=Math.max(len1,len2);
            maxLen=Math.max(maxLen,curMax);
        }
        return maxLen;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        System.out.println("The longest Palindrome Length: "+longestPalindromeLength(s));

    }
}
