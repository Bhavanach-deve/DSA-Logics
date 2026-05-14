import java.util.ArrayList;

class Search{
    public ArrayList<Integer>searching(int[]a,int[]b)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        int n=a.length;
        int m=b.length;

        for(int i=0;i<n-m;i++){
            boolean found=true;
            for(int j=0;j<m;j++){
                if(a[i+j]!=b[j]){
                    found=false;
                    break;
                }
            }
            if(found){
                ans.add(i);
            }
        }
        return ans;
    }
}
public class SearchForASubArray
{

    public static void main(String[] args)
    {
        int []a={2,4,1,0,4,1,1};
        int []b={4,1};
        Search s=new Search();
        ArrayList<Integer>res=s.searching(a,b);
        System.out.println(res);
    }
}
