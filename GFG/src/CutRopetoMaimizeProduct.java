//Given a rope of length n meters, cut it into multiple smaller ropes such that the product of their lengths is maximized. At least one cut is mandatory.
public class CutRopetoMaimizeProduct
{
    public static int maxProduct(int n){

        if(n==1)
            return 1;
        int max=0;
        for(int i=1;i<n;i++){
            max = Math.max(max,
                    Math.max(i * (n - i),
                            i * maxProduct(n - i)));
        }
        return max;
    }

    public static void main(String[] args) {
        int ans=maxProduct(5);
        System.out.println(ans);

    }
}
