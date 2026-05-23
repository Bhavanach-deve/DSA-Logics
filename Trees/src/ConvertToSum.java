//Given a root of a binary tree with n nodes, where each node may contain positive or negative values, convert it into a tree such that each node’s new value is equal to the sum of all values in its left and right subtrees (based on the original tree). For leaf nodes, update their values to 0.
class Nody{
    int data;
    Nody left;
    Nody right;

    public Nody(int values){
        data=values;
        left=right=null;
    }
}
class ConvertSum
{
    public void toSumTree(Nody root){
        convert(root);
    }
    public int convert(Nody root) {
        if (root == null) {
            return 0;
        }
        int oldValue = root.data;

        int left = convert(root.left);
        int right = convert(root.right);

        root.data = left + right;
        return oldValue + left + right;
    }

        // Inorder display
    public void inorder(Nody root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
public class ConvertToSum{

    public static void main(String[] args)
    {
       Nody n=new Nody(10);
       n.left=new Nody(-2);
       n.right=new Nody(6);
       n.left.left= new Nody(8);
       n.left.right=new Nody(-4);
       n.right.left=new Nody(7);
       n.right.right=new Nody(5);
       ConvertSum sum=new ConvertSum();
       System.out.println("Before Conversion:");
       sum.inorder(n);
       sum.toSumTree(n);
       System.out.println("\nAfter Conversion");
       sum.inorder(n);


    }
}