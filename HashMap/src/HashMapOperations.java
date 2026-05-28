import java.util.HashMap;

public class HashMapOperations
{
    void add_Value(HashMap<Integer, Integer> hm, int x, int y) {
        // Your code here
        hm.put(x,y);
    }

    /*Returns the value with key x from the map */
    int find_value(HashMap<Integer, Integer> hm, int x) {

        // Your code here
        return hm.getOrDefault(x,-1);
    }

    /*Returns the size of the map */

    int getSize(HashMap<Integer, Integer> hm) {
        // Your code here
        return hm.size();
    }


    /*Removes the entry with key x from the map */
    void removeKey(HashMap<Integer, Integer> hm, int x) {
        // Your code here
        hm.remove(x);
    }

    public static void main(String[] args) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        HashMapOperations obj = new HashMapOperations();

        // Add values
        obj.add_Value(hm, 1, 2);
        obj.add_Value(hm, 66, 3);

        // Print map
        System.out.println("HashMap: " + hm);

        // Find value
        System.out.println("Value of key 66: "
                + obj.find_value(hm, 66));

        // Size
        System.out.println("Size: "
                + obj.getSize(hm));

        // Remove key
        obj.removeKey(hm, 1);

        // Map after removal
        System.out.println("After removing key 1: " + hm);

        // Size again
        System.out.println("Size now: "
                + obj.getSize(hm));

    }
}
