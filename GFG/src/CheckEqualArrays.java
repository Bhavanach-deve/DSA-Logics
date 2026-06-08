//Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.
//Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
import java.util.Arrays;

public class CheckEqualArrays
{
    public static boolean checkEqual(int a[],int b[]){

        if(a.length!=b.length){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a[]={1,2,5,4,0};
        int b[]={2,4,5,0,1};
        boolean status=checkEqual(a,b);
        System.out.println(status);
    }
}
