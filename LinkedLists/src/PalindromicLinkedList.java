class Nodde{
    int data;
    Nodde next;
    Nodde(int data){
        this.data=data;
        this.next=null;
    }
}
public class PalindromicLinkedList
{
    public static boolean isPalindrome(Nodde head){
        if(head==null||head.next==null)
            return true;

        //find middle
        Nodde slow=head;
        Nodde fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse second Half
        Nodde secondhalf=reverse(slow);
        Nodde firsthalf=head;
        Nodde temp=secondhalf;
        //Compare
        while(temp!=null){
            if(firsthalf.data!=temp.data)
                return false;

            firsthalf=firsthalf.next;
            temp=temp.next;
        }
        return true;
    }
    public static Nodde reverse(Nodde head){
        Nodde prev=null;
        Nodde curr=head;

        while(curr!=null){
            Nodde next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args)
    {
        Nodde head = new Nodde(1);
        head.next = new Nodde(2);
        head.next.next = new Nodde(3);
        head.next.next.next = new Nodde(2);
        head.next.next.next.next = new Nodde(1);

        System.out.println(isPalindrome(head));

    }
}
