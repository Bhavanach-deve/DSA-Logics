public class MinSwapsGroupOnes {

    public static int minSwaps(int[] arr) {
        int ones = 0;

        // Count total 1s
        for (int num : arr) {
            if (num == 1)
                ones++;
        }

        // If no 1s
        if (ones == 0)
            return -1;

        int zeroCount = 0;

        // First window
        for (int i = 0; i < ones; i++) {
            if (arr[i] == 0)
                zeroCount++;
        }

        int minSwaps = zeroCount;

        // Sliding window
        for (int i = ones; i < arr.length; i++) {

            // Remove left element
            if (arr[i - ones] == 0)
                zeroCount--;

            // Add right element
            if (arr[i] == 0)
                zeroCount++;

            minSwaps = Math.min(minSwaps, zeroCount);
        }

        return minSwaps;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};

        System.out.println(minSwaps(arr)); // Output: 1
    }
}
