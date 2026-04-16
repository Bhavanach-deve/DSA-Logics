class Nodees{
    int data;
    Nodees next;

    Nodees(int data){
        this.data=data;
        this.next=null;

    }

}
public class PartitionList
{
    public static Nodees partition(Nodees head,int x){
        Nodees smallDummy=new Nodees(0);
        Nodees largeDummy=new Nodees(0);

        Nodees small=smallDummy;
        Nodees large=largeDummy;

        while(head!=null){
            if(head.data<x){
                small.next=head;
                small=small.next;
            }
            else{
                large.next=head;
                large=large.next;
            }
            head=head.next;
        }
        large.next=null;//If not null  then it will be a cyclic data
        small.next=largeDummy.next;//join
        return smallDummy.next;

    }
    public static void print(Nodees head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args)
    {
        Nodees head = new Nodees(1);
        head.next = new Nodees(4);
        head.next.next = new Nodees(3);
        head.next.next.next = new Nodees(2);
        head.next.next.next.next = new Nodees(5);
        head.next.next.next.next.next = new Nodees(2);

        head = partition(head, 3);

        print(head);

    }
}
