public class SmallestNonZeroOptimal
{
    static boolean check(int[] arr, long x) {

        long LIMIT = 1000000000000000000L; // 1e18

        for (int num : arr) {

            x = 2 * x - num;

            if (x < 0)
                return false;

            // Prevent overflow
            if (x > LIMIT / 2)
                x = LIMIT;
        }

        return true;
    }
    public static int find(int[] arr)
    {
        // code here
        long max = 0;

        for (int x : arr)
            max = Math.max(max, x);

        long low = 0;
        long high = max;
        long ans = max;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (check(arr, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int)ans;
    }

    public static void main(String[] args)
    {
        int arr[]={3,4,3,2,4};
        System.out.println(find(arr));

    }
}

