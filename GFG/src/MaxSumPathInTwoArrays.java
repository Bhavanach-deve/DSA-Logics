//Given two sorted arrays of distinct integers in increasing order a[] and b[], which may have some common elements, find the maximum sum of a path from the beginning of any array to the end of any array. You may switch from one array to the other only at common elements.
public class MaxSumPathInTwoArrays
{
    public static int maxPathSum(int[] a, int[] b)
    {
        int i=0,j=0;
        int sum1=0;
        int sum2=0;
        int result=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                sum1+=a[i++];
            }
            else if(a[i]>b[j]){
                sum2+=b[j++];
            }
            else{
                result+=Math.max(sum1,sum2);

                result+=a[i];
                sum1=0;
                sum2=0;

                i++;
                j++;
            }
        }
        while(i<a.length)
            sum1+=a[i++];
        while(j<b.length)
            sum2+=b[j++];
        result+=Math.max(sum1,sum2);

        return result;
    }

    public static void main(String[] args)
    {
        int a[]={2,3,7,10,12};
        int b[]={1,5,7,8};
        System.out.println(maxPathSum(a,b));

    }
}
