class Nodes{
    int data;
    Nodes next;

    Nodes(int data){
        this.data=data;
        this.next=null;
    }
}

public class MiddleOfTheLinkedList
{
    public static Nodes middleNode(Nodes head)
    {
        Nodes slow=head;
        Nodes fast=head;

        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args)
    {
        Nodes d1=new Nodes(1);
        d1.next=new Nodes(2);
        d1.next.next=new Nodes(3);
        d1.next.next.next=new Nodes(4);
        d1.next.next.next.next=new Nodes(5);

        Nodes middle=middleNode(d1);

        System.out.println("Middle node data: "+middle.data);

    }
}
