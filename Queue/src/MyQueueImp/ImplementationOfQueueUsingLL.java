package MyQueueImp;

public class ImplementationOfQueueUsingLL
{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    Node head;
    Node tail;

    //Add last
    public void enqueue(int x)
    {
        Node n=new Node(x);
        if(this.tail==null){
            this.head=this.tail=n;
            return;
        }
        this.tail.next=n;
        this.tail=n;
    }

    //removes the element in the first
    public int dequeue()
    {
        if(this.head==null){
            System.out.println("Queue is empty");

            return -1;
        }
        int rv=this.head.data;
        this.head=this.head.next;

        return rv;

    }
    //printing the queue
    public void display(){
        System.out.println("-------------");
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("----------------");
    }
}
