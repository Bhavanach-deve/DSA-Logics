public class UniqueNumberInAnArray
{
        public static int findUnique(int[] arr) {
            int result = 0;

            // check all 32 bits
            for (int i = 0; i < 32; i++) {

                int sum = 0;

                for (int num : arr) {
                    if ((num & (1 << i)) != 0) {
                        sum++;
                    }
                }

                if (sum % 3 != 0) {
                    result |= (1 << i);
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[] arr = {2, 2, 3, 2,3,3,5,5,5,6};

            System.out.println("Unique element is: " + findUnique(arr));
        }
    }