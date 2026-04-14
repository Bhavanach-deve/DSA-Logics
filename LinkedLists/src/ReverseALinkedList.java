class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseALinkedList
{
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

     public static void main (String args[])
     {
         Node head=new Node(1);
         head.next=new Node(2);
         head.next.next=new Node(3);
         head.next.next.next=new Node(4);
         printList(head);
         head=reverse(head);
         printList(head);

     }
}
