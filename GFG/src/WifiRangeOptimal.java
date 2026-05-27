public class WifiRangeOptimal
{
    public static boolean wifiCoverage(int x,String s){
        int n=s.length();
        boolean cover[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){

                int left=Math.max(0,i-x);
                int right=Math.min(n-1,i+x);

                for(int j=left;j<=right;j++){
                    cover[j]=true;
                }
            }
        }
        for(boolean rooms:cover){
            if(!rooms){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        boolean wifi=wifiCoverage(1,"10010");
        System.out.println(wifi);
        boolean wifi2=wifiCoverage(2,"10010");
        System.out.println(wifi2);



    }
}
