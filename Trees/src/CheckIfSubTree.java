class Node{

    int data;
    Node left;
    Node right;

    public Node(int value){
        data=value;
        left=right=null;
    }
}

class Subtree{
    public Node root;

    public boolean isIdential(Node root1,Node root2){
        //Both Null
        if(root1==null&&root2==null)
            return true;
        //One null and other not null
        if(root1==null||root2==null)
            return false;

        return (root1.data==root2.data)&&isIdential(root1.left,root2.left)&&isIdential(root1.right,root2.right);

    }

    public boolean isSubtree(Node root1,Node root2){

        //Empty subtree is always subtree
        if(root2==null)
            return true;

        //Main tree empty
        if(root1==null)
            return false;

        //Both Tree Match
        if(isIdential(root1,root2))
        return true;

        return isSubtree(root1.left,root2)||isSubtree(root1.right,root2);
    }
}

public class CheckIfSubTree
{
    public static void main(String[] args)
    {

        Node n=new Node(10);
        n.left=new Node(20);
        n.right=new Node(3);
        n.right.right=new Node(4);

        Node n1=new Node(3);
        n1.right=new Node(4);

        Subtree s=new Subtree();
        System.out.println(s.isSubtree(n,n1));

    }
}
//A tree S is considered a subtree of T if there exists a node in T such that the subtree rooted at that node is identical to S. Two trees are identical if they have the same structure and the same node values.