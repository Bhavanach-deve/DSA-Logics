public class SumOfTwoLargeNumbers
{
    public static String findSum(String s1, String s2){
        int i=s1.length()-1;
        int j=s2.length()-1;

        int carry=0;
        StringBuilder ans=new StringBuilder();
        while(i>=0 ||j>=0 ||carry>0){
            int sum=carry;

            if(i>=0){
                sum+=s1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=s2.charAt(j)-'0';
                j--;
            }
            ans.append(sum%10);
            carry=sum/10;
        }

        ans.reverse();

        int k = 0;
        while(k<ans.length() - 1 && ans.charAt(k) == '0') {
            k++;
        }
        return ans.substring(k);
    }

    public static void main(String[] args)
    {
        String s1="25";
        String s2="23";
        String ans=findSum(s1,s2);
        System.out.println(ans);
    }
}
