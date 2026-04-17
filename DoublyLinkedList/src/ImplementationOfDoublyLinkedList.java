class Double{
    int data;
    Double next;
    Double prev;

    Double(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}

public class ImplementationOfDoublyLinkedList
{
    Double head=null;
    Double tail=null;
    //Insert at the beginning
    public void insertAtBeginning(int data){
        Double newNode=new Double(data);

        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    //Insert at end
    public void inserAtEnd(int data){
        Double newNode=new Double(data);
        if(tail==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    //Delete from beginning
    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    //Delete from end
    public void deleteAtEnd(){
        if(tail==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
    }
    //Display forward
    public void displayForward(){
        Double temp=head;
        while(temp!=null){
            System.out.println(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //Display Backward
    public void displayBackward(){
        Double temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ImplementationOfDoublyLinkedList dll=new ImplementationOfDoublyLinkedList();
        dll.insertAtBeginning(20);
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(30);
        dll.insertAtBeginning(40);

        System.out.println("Forward Traversal");
        dll.displayForward();
        System.out.println("Backward Traversal");
        dll.displayBackward();
        dll.deleteAtBeginning();
        dll.deleteAtEnd();
        System.out.println("After Deletions: ");
        dll.displayForward();
    }
}
