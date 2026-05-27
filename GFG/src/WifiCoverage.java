//There are n rooms in a straight line in Geekland State University's hostel. You are given a binary string s of length n, where s[i] = '1' means there is a WiFi router in the i-th room, and s[i] = '0' means there is no WiFi in that room.
//
//Each WiFi router has a range of x, meaning it can cover up to x rooms to its left and x rooms to its right.
//
//Given x and s, determine whether all rooms are covered by at least one WiFi router. Return true if all rooms are covered; otherwise, return false.
public class WifiCoverage
{
    public static boolean wifiRange(String s,int x)
    {
        int n=s.length();
        for(int i=0;i<n;i++){
            boolean covered=false;

            for(int j=0;j<n;j++){
                if(s.charAt(j)=='1'&& Math.abs(i-j)<=x){
                    covered=true;
                    break;
                }
            }
            if(!covered){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args)
    {
        int x=1;
        String s="10010";
        boolean range=wifiRange(s,x);
        System.out.println(range);

    }

}
