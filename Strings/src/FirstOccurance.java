//Given two strings txt and pat, return the 0-based index of the first occurrence of the substring pat in txt. If pat is not found, return -1.
//Note: You are not allowed to use the inbuilt function.
//Brute force can be solved with KnuttMorisPatt
public class FirstOccurance
{
    public static int firstOcc(String text,String patt)
    {
        int n=text.length();
        int m=patt.length();
        for(int i=0;i<n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(text.charAt(i+j)!=patt.charAt(j))
                    break;
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }

   public static void main(String[] args)
   {
       String text="GeeksForGeeks";
       String pat="For";
       System.out.println(firstOcc(text,pat));

    }
}
