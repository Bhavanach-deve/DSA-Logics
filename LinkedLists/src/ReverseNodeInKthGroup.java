class Noode{
    int data;
    Noode next;

    Noode(int data){
        this.data=data;
        this.next=null;
    }
}

public class ReverseNodeInKthGroup
{
    public static Noode reverseKGroup(Noode head,int k){
        if(head==null&&k==1)
            return head;

        Noode dummy=new Noode(0);
        dummy.next=head;

        Noode prevGroup=dummy;

        while(true){
            //find kth node
            Noode kth=prevGroup;
            for(int i=0;i<k&&kth!=null;i++){
                kth=kth.next;
            }
            if(kth==null)break;

            Noode groupNext=kth.next;
            //Reverse group
            Noode prev=groupNext;
            Noode curr=prevGroup.next;

            while(curr!=groupNext){
                Noode temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            Noode temp=prevGroup.next;
            prevGroup.next=kth;
            prevGroup=temp;
        }
        return dummy.next;
    }
    public static void print(Noode head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        Noode head = new Noode(1);
        head.next = new Noode(2);
        head.next.next = new Noode(3);
        head.next.next.next = new Noode(4);
        head.next.next.next.next = new Noode(5);
        head = reverseKGroup(head, 2);
        print(head);


    }
}
