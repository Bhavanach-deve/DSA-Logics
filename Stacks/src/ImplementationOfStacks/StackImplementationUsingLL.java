package ImplementationOfStacks;

public class StackImplementationUsingLL
{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    Node head;
//push->addAtHead()
    public void push(int x)
    {
        Node n=new Node(x);
        n.next=this.head;
        this.head=n;

    }
    //pop->removes atTheHead
    public int pop(){
        if(this.head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int rv=this.head.data;
        this.head=this.head.next;
        return rv;

    }
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
