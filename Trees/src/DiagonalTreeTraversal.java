import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Nods{
    int data;
    Nods left;
    Nods right;

    public Nods(int value){
        data=value;
        left=right=null;
    }
}
class DiagonalTree{
    public ArrayList<Integer> diagonal(Nods root) {

        ArrayList<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<Nods> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            Nods curr = que.poll();

            while (curr != null) {
                result.add(curr.data);

                if (curr.left != null) {
                    que.add(curr.left);
                }
                curr = curr.right;
            }
        }
        return result;

    }
}
public class DiagonalTreeTraversal
{
    public static void main(String[] args)
    {
        Nods n=new Nods(8);
        n.left=new Nods(3);
        n.right=new Nods(10);
        n.left.left=new Nods(1);
        n.left.right=new Nods(6);
        n.right.right=new Nods(14);
        n.left.right.left=new Nods(4);
        n.left.right.right=new Nods(7);
        n.right.right.left=new Nods(13);
        DiagonalTree dt=new DiagonalTree();
        ArrayList<Integer>res=dt.diagonal(n);
        System.out.println(res);


    }
}
