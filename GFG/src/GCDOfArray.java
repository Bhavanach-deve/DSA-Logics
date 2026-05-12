class Gcd{
    public int gcd(int arr[]){
        int gcd=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            gcd=findGCD(gcd,arr[i]);
        }
        return gcd;
    }
    public int findGCD(int a,int b)
    {
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}
public class GCDOfArray
{
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        Gcd g=new Gcd();
        int res=g.gcd(arr);
        System.out.println(res+" : is the Greatest Common divisor of the given array.");


    }
}
