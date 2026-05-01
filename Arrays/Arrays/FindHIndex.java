import java.util.Arrays;

public class FindHIndex
{
    public static int hIndex(int[]citations){
        Arrays.sort(citations);
        int n=citations.length;

        int h=0;
        for(int i=0;i<n;i++){
            int papers=n-i;
            if(citations[i]>=papers) {
                h = papers;
                break;
            }
        }
        return h;
    }
    public static void main(String[] args)
    {
        int citations[]={3,0,5,3,0};
        System.out.println(hIndex(citations));
    }
}
