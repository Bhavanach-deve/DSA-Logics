//Given a string s containing alphanumeric characters. You have to calculate the sum of all the numbers present in the string.
public class SumOfNumbersInStringGFG
{
    public static int findSum(String s){
        int sum=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                num=num*10+(ch-'0');
            }
            else {
                sum=sum+num;
                num=0;
            }
        }
        sum+=num;
        return sum;
    }
    public static void main(String[] args)
    {
        String s="1abc23";
        int ans=findSum(s);
        System.out.println(ans);

    }
}
