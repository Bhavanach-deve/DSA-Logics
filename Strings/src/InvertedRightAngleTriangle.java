public class InvertedRightAngleTriangle
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || j==0||i>j){
                    System.out.print("*");
                }
//                else{
//                    System.out.print("_");
//                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
