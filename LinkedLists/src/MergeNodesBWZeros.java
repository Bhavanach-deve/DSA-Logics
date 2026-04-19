class Ndes{
    int data;
    Ndes next;

    Ndes(int data){
        this.data=data;
        this.next=null;
    }

}
public class MergeNodesBWZeros
{
    public static Ndes mergeNodesSum(Ndes head)
    {
        Ndes temp=head.next;
        Ndes dummy=new Ndes(0);
        Ndes tail=dummy;
        int sum=0;
        while(temp!=null){
            if(temp.data!=0){
                sum=sum+temp.data;
            }
            else{
                tail.next=new Ndes(sum);
                tail=tail.next;
                sum=0;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
    public static void print(Ndes head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
            System.out.println("null");
        }
    }

    public static void main(String[] args)
    {
        Ndes head=new Ndes(0);
        head.next=new Ndes(1);
        head.next.next=new Ndes(3);
        head.next.next.next=new Ndes(0);
        head.next.next.next.next=new Ndes(4);
        head.next.next.next.next.next=new Ndes(5);
        head.next.next.next.next.next.next=new Ndes(2);
        head.next.next.next.next.next.next.next=new Ndes(0);
        head=mergeNodesSum(head);
        print(head);


    }
}
