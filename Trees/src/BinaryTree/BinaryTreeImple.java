package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

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
    //Breadth First Search
    public void levelOrder()
    {
        if(root==null)
            return;
        Queue<Nodes>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Nodes temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)queue.add(temp.left);
            if(temp.right!=null)queue.add(temp.right);

        }

    }
    //Search for an element in Binary Tree
    public boolean searchForData(Nodes root,int x)
    {
        if(root==null)
            return false;
        if(root.data==x){
            return true;
        }
        boolean lf=searchForData(root.left,x);
        boolean rt=searchForData(root.right,x);

        return lf||rt;

    }
}
