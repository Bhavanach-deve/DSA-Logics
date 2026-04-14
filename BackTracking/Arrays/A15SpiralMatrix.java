import java.util.Scanner;

public class A15SpiralMatrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];

        System.out.println("Enter matrix Elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //Displaying matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //Initializing Variables
        int top=0, bottom=n-1;
        int left=0, right=m-1;

        System.out.println("Spiral Order: ");

        while(top<=bottom && left<=right){
            //1.Left to right
            for(int i=left;i<=right;i++) {
                System.out.print(matrix[top][i] +" ");
            }
            top++;
            //2. Top to bottom
            for(int i=top;i<=bottom;i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            //3. Right to left
            if(top<=bottom) {
                for (int i =right;i>=left;i--){
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom--;
            }
            //4. Bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }
        }
    }
}
