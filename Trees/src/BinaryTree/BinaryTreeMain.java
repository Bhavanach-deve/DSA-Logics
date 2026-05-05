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

        System.out.print("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println();
        System.out.print("Preorder Traversal:");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("Posteorder Traversal:");
        tree.postOrder(tree.root);

    }
}
