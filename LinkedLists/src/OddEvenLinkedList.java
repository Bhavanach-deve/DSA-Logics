import java.util.jar.JarOutputStream;

class OENode{
    int data;
    OENode next;

    OENode(int data){
        this.data=data;
        this.next=null;
    }
}
public class OddEvenLinkedList
{
    public static OENode OddorEven(OENode head)
    {
        if(head==null)
            return null;
        OENode odd=head,even=head.next,evenhead=even;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
    public static void print(OENode head){
        OENode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {

        OENode oe=new OENode(1);
        oe.next=new OENode(2);
        oe.next.next=new OENode(3);
        oe.next.next.next=new OENode(4);
        oe.next.next.next.next=new OENode(5);
        print(oe);
        oe=OddorEven(oe);
        System.out.println();
        System.out.print("Odd and even nodes: ");
        print(oe);



    }
}
