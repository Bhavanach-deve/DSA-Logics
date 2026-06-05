//Given two integer arrays a[] and b[]. Return the list of elements common to both the lists and return the list in sorted order. Duplicates may be there in the output list.
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements
{
    public static ArrayList<Integer> commonElements(int a[], int b[])
    {
        ArrayList<Integer>ans=new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;

        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int a[]={3,4,2,2,4};
        int b[]={3,2,2,7};
        System.out.println(commonElements(a,b));



    }
}
