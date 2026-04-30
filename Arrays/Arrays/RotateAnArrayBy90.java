import java.util.*;
public class RotateAnArrayBy90 {
    // Function to rotate the matrix 90 degrees clockwise using extra space
        public int[][] rotateClockwise(int[][] matrix) {
            // Get the size of the square matrix
            int n = matrix.length;

            // Create a new matrix of same size to store rotated result
            int[][] rotated = new int[n][n];

            // Traverse each element of original matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Place the element at its new rotated position
                    rotated[j][n - i - 1] = matrix[i][j];
                }
            }

            // Return the rotated matrix
            return rotated;
        }
    }

    // Driver class
    class Main {
        public static void main(String[] args) {
            int[][] mat = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            RotateAnArrayBy90 obj = new RotateAnArrayBy90();
            int[][] rotated = obj.rotateClockwise(mat);

            // Print the rotated matrix
            for (int[] row : rotated) {
                for (int val : row)
                    System.out.print(val + " ");
                System.out.println();
            }
        }
    }
