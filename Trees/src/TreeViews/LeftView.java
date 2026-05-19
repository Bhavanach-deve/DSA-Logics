package TreeViews;
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class Solution {

    public ArrayList<Integer> leftView(Node root) {

        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Traverse one level
            for (int i = 0; i < size; i++) {

                Node curr = queue.poll();

                // First node of level
                if (i == 0) {
                    result.add(curr.data);
                }

                if (curr.left != null) {
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }

        return result;
    }
}
public class LeftView {
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        Solution obj = new Solution();

        ArrayList<Integer> result = obj.leftView(root);

        System.out.println("Left View of Binary Tree:");

        System.out.println(result);
    }
}
