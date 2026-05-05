package BinaryTree;

class Nodes{
    public int data;
    Nodes left;
    Nodes right;

    public Nodes(int value){
        data=value;
        left=right=null;
    }
}
public class BinaryTreeImple
{

    public Nodes root;

    public void inorder(Nodes root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void preOrder(Nodes root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public void postOrder(Nodes root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

}
