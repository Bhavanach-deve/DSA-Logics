public class SingleNumber {
    public static int findSingle(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result ^= num; // XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};

        System.out.println("Single element is: " + findSingle(arr));
    }
}
