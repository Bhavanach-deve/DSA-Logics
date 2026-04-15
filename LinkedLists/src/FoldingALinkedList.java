class Nodee{
    int data;
    Nodee next;

    Nodee(int data){
        this.data=data;
        this.next=next;
    }
}
public class FoldingALinkedList {
    //Step 1: Find Middle
    public static Nodee findMiddle(Nodee head) {
        Nodee slow = head;
        Nodee fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //Step 2: Reverse list
    public static Nodee reverse(Nodee head) {
        Nodee prev = null;
        Nodee curr = head;

        while (curr != null) {
            Nodee next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    //Step 3: Merge alternately
    public static void reorderList(Nodee head) {
        if (head == null || head.next == null)
            return;

        //find middle
        Nodee mid = findMiddle(head);

        //split
        Nodee second = mid.next;
        mid.next = null;

        //reverse second half
        second = reverse(second);

        //merge
        Nodee first = head;

        while (second != null) {
            Nodee temp1 = first.next;
            Nodee temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
    //Print
    public static void printList(Nodee head) {
        Nodee temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Nodee n=new Nodee(1);
        n.next=new Nodee(2);
        n.next.next=new Nodee(3);
        n.next.next.next=new Nodee(4);
        n.next.next.next.next=new Nodee(5);

        reorderList(n);
        printList(n);
    }
}


