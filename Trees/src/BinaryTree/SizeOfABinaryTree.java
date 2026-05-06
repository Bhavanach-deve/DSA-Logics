package BinaryTree;

class Node {
    public int data;
    Node left;
    Node right;

    public Node(int value) {
        data = value;
        left = right = null;

    }
}

class Tree {
    public Node root;

    public int sizeOfTheTree(Node root) {
        if (root == null)
            return 0;
        return 1 + sizeOfTheTree(root.left) + sizeOfTheTree(root.right);

        }
    }

public class SizeOfABinaryTree
{
    public static void main(String[] args)
    {
        Tree t=new Tree();
        t.root=new Node(10);
        t.root.left=new Node(20);
        t.root.right=new Node(30);
        t.root.left.left=new Node(40);
        t.root.left.right=new Node(50);
        int size=t.sizeOfTheTree(t.root);
        System.out.print("The size(No.of elements) of the tree are: "+ size);

    }
}
