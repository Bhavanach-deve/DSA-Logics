public class ReturnTheSingleSetBit {
        public static int findPosition(int n) {

            int count = 0;
            int position = 0;
            int index = 1; // position starts from 1 (LSB)

            while (n > 0) {
                if ((n & 1) == 1) {
                    count++;
                    position = index;
                }

                n = n >> 1;
                index++;
            }

            if (count == 1) {
                return position;
            } else {
                return -1;
            }
        }

        public static void main(String[] args) {
            System.out.println(findPosition(2)); // 2
            System.out.println(findPosition(5)); // -1
        }
    }
