class Nnode{
    int data;
    Nnode next;

    Nnode(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemoveNthNodeFromTheEnd
{
    public static Nnode removeEnd(Nnode head,int n){
        Nnode dummy=new Nnode(0);
        dummy.next=head;
        Nnode first=dummy;
        Nnode second=dummy;

        for(int i=0;i<=n;i++){
            first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;

    }
    public static void print(Nnode head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Nnode head = new Nnode(1);
        head.next = new Nnode(2);
        head.next.next = new Nnode(3);
        head.next.next.next = new Nnode(4);
        head.next.next.next.next = new Nnode(5);
        head=removeEnd(head,3);
        print(head);

    }
}
