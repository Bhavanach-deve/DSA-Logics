import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> searchSubarray(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();

            int n = a.length;
            int m = b.length;

            int[] lps = buildLPS(b);

            int i = 0, j = 0;

            while (i < n) {

                if (a[i] == b[j]) {

                    i++;
                    j++;
                }

                if (j == m) {

                    ans.add(i - j);

                    j = lps[j - 1];
                }

                else if (i < n && a[i] != b[j]) {

                    if (j != 0) {

                        j = lps[j - 1];

                    } else {

                        i++;
                    }
                }
            }

            return ans;
        }

        private int[] buildLPS(int[] b) {

            int m = b.length;

            int[] lps = new int[m];

            int len = 0;
            int i = 1;

            while (i < m) {

                if (b[i] == b[len]) {

                    len++;
                    lps[i] = len;
                    i++;

                } else {

                    if (len != 0) {

                        len = lps[len - 1];

                    } else {

                        lps[i] = 0;
                        i++;
                    }
                }
            }

            return lps;
        }
    }
public class SearchForSubArrayOptimizedKMP
{
    public static void main(String[] args)
    {
        int a[]={2,4,1,0,4,1,1};
        int b[]={4,1};
        Solution s=new Solution();
        ArrayList<Integer>res=s.searchSubarray(a,b);
        System.out.println(res);
    }
}
