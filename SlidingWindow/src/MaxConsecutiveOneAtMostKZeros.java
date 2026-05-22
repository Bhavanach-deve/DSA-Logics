//Maximum consecutive ones length with at most k no.of zeros.
import java.util.*;
public class MaxConsecutiveOneAtMostKZeros
{
    public static int maxLength(List<Integer>nums,int k){
        int l=0,zeros=0,maxLen=0;

        for(int r=0;r<nums.size();r++) {
            if (nums.get(r) == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums.get(l) == 0) {
                    zeros--;
                }
                l++;
            }
            int len = r - l + 1;
            maxLen=Math.max(maxLen,len);
        }
        return maxLen;
    }

    public static void main(String[] args)
    {
        List<Integer>list=Arrays.asList(1,1,1,0,0,0,1,1,1,1,0);
        int k=2;
        System.out.print("With at most "+k+" zeros, the longest valid subarray length is : ");
        System.out.println(maxLength(list,k));


    }
}
