//Given a singly linked list, remove all nodes that have a node with a greater value anywhere to their right in the list. Return the head of the modified linked list.
class LLNode
{
    int data;
    LLNode next;

    LLNode(int d){
        this.data=d;
        next=null;
    }

}
public class DeleteNodeWithGreaterOnRight
{
    public static LLNode reverse(LLNode head)
    {
        LLNode prev=null;
        LLNode curr=head;

        while(curr!=null){
            LLNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static LLNode compute(LLNode head)
    {
        head=reverse(head);
        int maxSoFar=head.data;
        LLNode curr=head;

        while(curr!=null && curr.next!=null){
            if(curr.next.data<maxSoFar){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
                maxSoFar=curr.data;
            }
        }
        return reverse(head);
    }
    public static void printList(LLNode head){
        LLNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args)
    {
        LLNode ll=new LLNode(12);
        ll.next=new LLNode(15);
        ll.next.next=new LLNode(10);
        ll.next.next.next=new LLNode(11);
        ll.next.next.next.next=new LLNode(5);
        ll.next.next.next.next.next=new LLNode(6);
        ll.next.next.next.next.next.next=new LLNode(2);
        ll.next.next.next.next.next.next.next=new LLNode(3);
        printList(ll);
        ll=compute(ll);
        printList(ll);


    }
}
