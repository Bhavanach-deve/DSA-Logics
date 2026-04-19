//Implement addition of two numbers represented as linked lists with carry handling for unequal lengths
class Nedo{
    int data;
    Nedo next;

    Nedo(int data)
    {
        this.data=data;
        this.next=null;

    }
}
public class AddTwoNumber
{
    public static Nedo sum(Nedo l1,Nedo l2)
    {
        Nedo dummy=new Nedo(0);
        Nedo curr=dummy;

        int carry=0;

        while(l1!=null||l1!=null||carry!=0){
            int sum=carry;
            if(l1!=null){
                sum=sum+l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.data;
                l2=l2.next;
            }
            curr.next=new Nedo(sum%10);
            curr=curr.next;

            carry=sum/10;
        }
        return dummy.next;
    }

    public static void print(Nedo head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        Nedo x = new Nedo(3);
        x.next = new Nedo(4);
        x.next.next = new Nedo(2);

        Nedo y = new Nedo(4);
        y.next = new Nedo(6);
        y.next.next = new Nedo(5);
        print(x);
        print(y);
        Nedo ans = sum(x, y);
        print(ans);


    }
}
