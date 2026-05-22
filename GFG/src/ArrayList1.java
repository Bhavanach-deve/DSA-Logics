//Given a ArrayList of N elements and a integer Q defining the type of query(which will be either 1 or 2) :
//Q = 1 includes two integers p and r. Which means insert the value r at index p in the ArrayList and print the whole updated ArrayList.
//Q = 2 includes one integer p. In this query print the index at which the value p is last found in the ArrayList. If the value p is not found in the ArrayList then print "-1".
import java.util.*;
class ArrayList1 {

    public static void solveQuery(ArrayList<Integer> arr, int Q, int query[]) {

        // Query Type 1 -> Insert
        if(Q == 1) {

            int p = query[0];
            int r = query[1];

            arr.add(p, r);

            System.out.println(arr);
        }

        // Query Type 2 -> Last occurrence
        else if(Q == 2) {

            int p = query[0];

            System.out.println(arr.lastIndexOf(p));
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr =
                new ArrayList<>(Arrays.asList(1,4,5,9,3));
        System.out.print("ArrayList before insertion: [");
        for(int nums:arr){
            System.out.print(nums+",");
        }
        System.out.print("]");
        System.out.println();


        int Q = 1;

        int query[] = {2,6};

        System.out.print("ArrayList after insertion: ");

        solveQuery(arr, Q, query);

        int Q2=2;

        int query2[]={9};

        System.out.println("The element last seen at:");

        solveQuery(arr,Q2,query2);


    }
}
