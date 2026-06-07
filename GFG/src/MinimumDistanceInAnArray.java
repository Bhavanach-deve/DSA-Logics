//You are given an array, arr[]. Find the minimum index based distance between two distinct elements of the array, x and y. Return -1, if either x or y does not exist in the array.
public class MinimumDistanceInAnArray
{
    public static int minDist(int arr[],int x,int y)
    {
        int min = Integer.MAX_VALUE;
        boolean foundX = false;
        boolean foundY = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                foundX = true;

                for (int j = 0; j < arr.length; j++) {

                    if (arr[j] == y) {
                        foundY = true;
                        min = Math.min(min, Math.abs(i - j));
                    }
                }
            }
        }

        if (!foundX || !foundY) {
            return -1;
        }

        return min;
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,2};
        System.out.println(minDist(arr,1,2));

    }
}
