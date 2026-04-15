class N{
    int data;
    N next;

    public N(int data){
        this.data=data;
        this.next=null;
    }
}
public class FloydsCycleAlgorithm
{
    public static boolean hasCycle(N head){
        if(head==null)
            return false;

        N slow=head;
        N fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true; //cycle
            }
        }
        return false;//no cycle
    }

    public static void main(String[] args)
    {
        N n=new N(1);
        n.next=new N(2);
        n.next.next=new N(3);
        n.next.next.next=new N(4);
        n.next.next.next.next=new N(5);
//creating cycle
        n.next.next.next.next.next=n.next.next;
        System.out.println("Cycle present? "+hasCycle(n));

    }

}
