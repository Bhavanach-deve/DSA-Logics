//Given an integer k representing the number of people to be seated and an array seats[], where 0 denotes an empty seat and 1 denotes an occupied seat.
//Determine whether it is possible to seat all k people such that no two occupied seats are adjacent (including newly seated people).
public class SeatingArrangement
{
    public static boolean seating(int []seats,int k) {
        int n = seats.length;

        for (int i = 0; i < n - 1; i++) {
            if (seats[i] == 1 && seats[i + 1] == 1) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {

            if (seats[i] == 0) {

                boolean leftEmpty =
                        (i == 0 || seats[i - 1] == 0);

                boolean rightEmpty =
                        (i == n - 1 || seats[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    seats[i] = 1;
                    k--;
                }

            }
        }
        return k <= 0;
    }

            public static void main (String[]args)
            {
                int arr[]={0, 0, 1, 0, 0, 0, 1};
                int k=2;
                boolean status=seating(arr,k);
                System.out.println(status);

            }
        }
