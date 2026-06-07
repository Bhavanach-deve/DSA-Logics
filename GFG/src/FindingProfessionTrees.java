//Consider a special family of Engineers and Doctors with following rules :
//Everybody has two children.
//First child of an Engineer is an Engineer and second child is a Doctor.
//First child of an Doctor is Doctor and second child is an Engineer.
//All generations of Doctors and Engineers start with Engineer.
//Given level and position (pos) of a person in above ancestor tree, find profession of the person.
class Node{
    String data;
    Node left;
    Node right;

    public Node(String value){
        this.data=value;
    }
}


public class FindingProfessionTrees
{
    public static String profession(Node root,int level,int pos){
        int flips=Integer.bitCount(pos-1);
        return (flips%2==0)?"Engineer":"Doctor";
    }

    public static void main(String[] args)
    {
        Node n=new Node("E");
        n.left=new Node("E");
        n.right=new Node("D");
        n.left.left=new Node("E");
        n.left.right=new Node("D");
        n.right.left=new Node("D");
        n.right.right=new Node("E");
        n.left.left.left=new Node("E");
        n.left.left.right=new Node("D");
        n.right.right.left=new Node("D");
        n.right.right.right=new Node("E");
        n.right.right.right.left=new Node("D");
        n.right.right.right.right=new Node("E");
        n.right.right.right.right.left=new Node("E");
        n.right.right.right.right.right=new Node("D");
        String ans=profession(n,2,2);
        System.out.println(ans);




    }
}
