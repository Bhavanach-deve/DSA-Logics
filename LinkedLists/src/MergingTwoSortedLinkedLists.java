class Nod{
    int data;
    Nod next;

    Nod(int data){
        this.data=data;
        this.next=null;
    }
}
public class MergingTwoSortedLinkedLists
{
    public static Nod mergeTwoLists(Nod n1,Nod n2){
        Nod prevHead=new Nod(-1);
        Nod prev=prevHead;

        while(n1!=null&& n2!=null){
            if(n1.data<=n2.data){
                prev.next=n1;
                n1=n1.next;
            }else{
                prev.next=n2;
                n2=n2.next;
            }
            prev=prev.next;
        }
        prev.next=n1==null?n2:n1;
        return prevHead.next;
    }
    //print function
    public static void printList(Nod head){
        Nod temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Nod n=new Nod(1);
        n.next=new Nod(2);
        n.next.next=new Nod(4);

        Nod nn=new Nod(1);
        nn.next=new Nod(3);
        nn.next.next=new Nod(4);
        Nod merging=mergeTwoLists(n,nn);
        System.out.println("After merging:");
        printList(merging);
    }
}
