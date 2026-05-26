//Given two number n1 and n2, n1 > n2. Find the differences between mathematical tables of n1 and n2 and print in a single line.
//Note: Don't add a new line in the end.
public class TableDifference
{
    public static void table(int n1,int n2){
        int ans1=1;
        int ans2=1;
        int diff=0;
        for(int i=1;i<=10;i++){
            ans1=n1*i;
            ans2=n2*i;
//            System.out.println(n1+"*"+i+"="+ans1);
//            System.out.println(n2+"*"+i+"="+ans1);
            System.out.println(ans1-ans2);
        }
    }

    static void main(String[] args) {
        table(9,4);
    }
}
