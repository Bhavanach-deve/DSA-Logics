class Nod
{
    int data;
    Nod left;
    Nod right;

    public Nod(int value){
        data=value;
        left=right=null;
    }
}
public class LowestCommonAncestor
{
    public static Nod lca(Nod root,int p,int q){

        if(root==null)
            return null;

        if(root.data==p||root.data==q){
            return root;
        }
        //Search left and right
        Nod left=lca(root.left,p,q);
        Nod right=lca(root.right,p,q);

        if(left!=null && right!=null)
            return root;

        return(left!=null)?left:right;
    }

    public static void main(String[] args)
    {
        Nod n=new Nod(1);
        n.left=new Nod(2);
        n.right=new Nod(3);
        n.left.left=new Nod(4);
        n.left.right=new Nod(5);
        n.right.left = new Nod(6);
        n.right.right = new Nod(7);

        Nod ans=lca(n,2,7);
        System.out.println(ans.data);

    }
}
