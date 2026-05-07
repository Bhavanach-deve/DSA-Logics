package BinaryTree;

class Nodee
{
    public int data;
    Nodee left;
    Nodee right;

    public Nodee(int value)
    {
        data=value;
        left=right=null;
    }

}

class PreOrder
{
    public Nodee root;

    int index=0;

    public Nodee bstfromPreOrder(int prearr[])
    {
        return preOrder(prearr,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }

    public Nodee preOrder(int[]prearr,int lower,int upper)
    {
        if(index==prearr.length) {
            return null;
        }

        int value=prearr[index];

        if(value<lower||value>upper)
            return null;

        index++;

        Nodee root=new Nodee(value);

        root.left=preOrder(prearr,lower,value);
        root.right=preOrder(prearr,value,upper);

        return root;

    }
    // Inorder traversal to verify BST
    public void inorder(Nodee root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

}


public class BinaryTreeFromPreOrderTraversal
{
    public static void main(String[] args)
    {
        int prearr[]={8,5,1,7,10,12};

        PreOrder tree=new PreOrder();

        Nodee root=tree.bstfromPreOrder(prearr);

        System.out.println("Inorder Traversal: ");

        tree.inorder(root);

    }

}
