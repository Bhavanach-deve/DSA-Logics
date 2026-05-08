import java.util.ArrayList;
import java.util.List;

class Nodes
{
    int data;
    Nodes left;
    Nodes right;

    Nodes(int value){
        data=value;
        left=right=null;
    }
}

public class RootToNodePath
{
    public static boolean findPath(Nodes root, int target, List<Integer> path){

        if(root==null)
            return false;

        path.add(root.data);

        if(root.data==target){
            return true;
        }

        if(findPath(root.left,target,path)||findPath(root.right,target,path)){
            return true;
        }
        //backTrack
        path.remove(path.size()-1);

        return false;
    }

    public static void main(String[] args) {

        Nodes n=new Nodes(1);
        n.left=new Nodes(2);
        n.right=new Nodes(3);
        n.left.left=new Nodes(4);
        n.left.right=new Nodes(5);
        n.right.left=new Nodes(6);
        n.right.right=new Nodes(7);

        List<Integer>path=new ArrayList<>();
        int target=5;

        if(findPath(n,target,path)){
            System.out.println(path);
        }else{
            System.out.println("Node not found");
        }
    }
}
