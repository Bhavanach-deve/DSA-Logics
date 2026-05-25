//Geek is getting really fat. He wants to lose his weight but can't get the motivation to workout. Seeing this, his friend  Heisenberg offers him a deal.
//For every K pushups Geek does, Heisenberg will give him money equal to the number of pushups Geek has done till then (Refer Example for Explanation).
//Find out the amount of money he made if he does N pushups.
//Example 1:
//Input: N = 5, K = 2
//Output: 6
//Explanation: Pushup 1: No Money, Pushup 2:
//+2 Pushup 3: No Money, Pushup 4: +4 and
//Pushup 5: No Money.
public class GeeksWeight
{
    public static long totalMoney(int n,int k){

        long sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int n=5;
        int k=2;
        System.out.println(totalMoney(n,k));

    }
}
