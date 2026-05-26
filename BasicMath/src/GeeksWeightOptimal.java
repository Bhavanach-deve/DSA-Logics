public class GeeksWeightOptimal
{
    public static long pushUps(int n,int k){
        long count=n/k;
        return k*(count*(count+1))/2;
    }

    public static void main(String[] args)
    {
        int n=5;
        int k=2;
        System.out.println(pushUps(n,k));

    }
}
