class Nnodes{
    int data;
    Nnodes next;

    Nnodes(int data){
        this.data=data;
        this.next=null;
    }
}
public class MaximumTwinSum
{
    public static int pairSum(Nnodes head)
    {
        //Step 1:Find Middle
        Nnodes slow=head;
        Nnodes fast=head;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //Step 2:Reverse second Half
        Nnodes second=reverse(slow);

        //Step 3:Compare twin sums
        Nnodes first=head;
        int max=0;

        while(second!=null){
            max=Math.max(max,first.data+second.data);
            first=first.next;
            second=second.next;
        }
        return max;
    }
    public static Nnodes reverse(Nnodes head){
        Nnodes prev=null;
        Nnodes curr=head;

        while(curr!=null){
            Nnodes next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args)
    {
        Nnodes n=new Nnodes(1);
        n.next=new Nnodes(2);
        n.next.next=new Nnodes(4);
        n.next.next.next=new Nnodes(5);
        System.out.println(pairSum(n));
    }
}
