public class A10MangoDistribution
{
        public static int maxMinMangoes(int[][] mat) {
            int n = mat.length;
            int m = mat[0].length;

            int[][] prefix = new int[n][m];

            // Step 1: Build prefix sum
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    prefix[i][j] = mat[i][j];

                    if (i > 0) prefix[i][j] += prefix[i - 1][j];
                    if (j > 0) prefix[i][j] += prefix[i][j - 1];
                    if (i > 0 && j > 0) prefix[i][j] -= prefix[i - 1][j - 1];
                }
            }

            int result = 0;

            // Step 2: Try all cuts
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m - 1; j++) {

                    int topLeft = prefix[i][j];

                    int topRight = prefix[i][m - 1] - topLeft;

                    int bottomLeft = prefix[n - 1][j] - topLeft;

                    int bottomRight = prefix[n - 1][m - 1]
                            - topLeft - topRight - bottomLeft;

                    int minPart = Math.min(
                            Math.min(topLeft, topRight),
                            Math.min(bottomLeft, bottomRight)
                    );

                    result = Math.max(result, minPart);
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[][] mat = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            System.out.println(maxMinMangoes(mat));
        }
    }
