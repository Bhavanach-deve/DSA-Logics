package BinaryTree;

public class BinaryTreeMain
{
    public static void main(String[] args)
    {
        BinaryTreeImple tree=new BinaryTreeImple();
        tree.root=new Nodes(10);
        tree.root.left=new Nodes(20);
        tree.root.right=new Nodes(30);
        tree.root.left.left=new Nodes(40);

        System.out.println("Depth First Traversal");
        System.out.print("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println();
        System.out.print("Preorder Traversal:");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("Posteorder Traversal:");
        tree.postOrder(tree.root);
        System.out.println();
        System.out.print("Breadth First Traversal: ");
        tree.levelOrder();
        int x=40;
        System.out.println();
        System.out.println("Is "+x+" in the tree?");
        System.out.println(tree.searchForData(tree.root,x));

    }
}
