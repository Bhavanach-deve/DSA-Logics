public class BinarySearchSquareOfANumber
{
    public static boolean square(int x)
    {
     int l=0;
     int r=x;
     while(l<=r){
         int mid=(l+r)/2;
         if(mid*mid==x)
         {
             return true;
         }
         else if(mid*mid<x){
             l=mid+1;
         }
         else
         {
             r=mid-1;
         }
     }
     return false;
    }

    public static void main(String[] args)
    {
        int x=16;

        if(square(x))
            System.out.println("Perfect Square");
        else
            System.out.println("Not a perfect square");

    }
}
