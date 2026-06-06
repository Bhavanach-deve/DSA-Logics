//Given two integers n and m representing the dimensions of a chessboard, find the number of ways to place one black knight and one white knight on the chessboard such that they cannot attack each other.
//The knights have to be placed on different squares.
//A knight can move two squares horizontally and one square vertically (L shaped), or two squares vertically and one square horizontally (L shaped).
//The knights attack each other if one can reach the other in one move.


public class NonAttackingBlackAndWhiteKnights
{
    public static int numOfWays(int n,int m)
    {
        int placement=n*m;
        int ways=placement*(placement-1);
        int attacking=4*((n-1)*(m-2)+(n-2)*(m-1));

        return ways-attacking;
    }

    public static void main(String[] args)
    {
        System.out.println(numOfWays(2,2));


    }
}
