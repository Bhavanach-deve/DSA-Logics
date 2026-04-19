//Implement removal of consecutive zero-sum node sequences in linked list using prefix sum hashmap
import java.util.HashMap;
class Noddes{
    int data;
    Noddes next;

    Noddes(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemoveZeroSumConsecutiveNodes
{
    public static Noddes removeZeroSum(Noddes head){
        Noddes dummy=new Noddes(0);
        dummy.next=head;

        HashMap<Integer,Noddes>map=new HashMap<>();

        int prefixsum=0;
        Noddes temp=dummy;

        //First pass: store latest node for each prefix sum
        while(temp!=null){
            prefixsum=prefixsum+temp.data;
            map.put(prefixsum,temp);
            temp=temp.next;
        }
        //Second pass: remove zero-sum sequences
        prefixsum=0;
        temp=dummy;
        while(temp!=null){
            prefixsum=prefixsum+temp.data;
            temp.next=map.get(prefixsum).next;//Gets the value of the next node where sum is getting zero in the hash map. i.e sum is zero at node -3 and the next node value is 3
            temp=temp.next;
        }
        return dummy.next;
    }
    public static void print(Noddes head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }
   public static void main(String[] args)
   {
       Noddes head = new Noddes(1);
       head.next = new Noddes(2);
       head.next.next = new Noddes(3);
       head.next.next.next = new Noddes(-3);
       head.next.next.next.next = new Noddes(-2);
       System.out.println("Original list:");
       print(head);
       head=removeZeroSum(head);
       print(head);

    }
}
