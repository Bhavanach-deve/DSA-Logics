class Node
{
    int data;
    Node prev,next;

    Node(int data){
        this.data=data;
        prev=next=null;
    }

}
public class DoubleLLPairSum
{
    Node head;

    //Insert at end
    public void insert(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    //Find pairs with given sum
    public void pairSum(int target){
        Node first=head;
        Node second=head;
        //Move second to last node
        while(second.next!=null){
            second=second.next;
        }
        boolean found=false;

        while(first!=null && second!=null&&first!=second&&second.next!=first){
            int sum=first.data+second.data;

            if(sum==target){
                System.out.println("("+first.data+","+second.data+")");
                found=true;
                first=first.next;
                second=second.prev;
            }
            else if(sum<target){
                first=first.next;
            }
            else{
                second=second.prev;
            }
        }
        if(!found){
            System.out.println("No pair found");
        }
    }
    public static void main(String[] args)
    {
        DoubleLLPairSum list=new DoubleLLPairSum();
        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(8);
        list.insert(9);
        int target=7;
        System.out.println("Pairs with sum: "+target+" :");
        list.pairSum(target);



    }
}
