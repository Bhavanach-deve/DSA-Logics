package MyLinkedListImplementation;

public class LinkedList
{
    public static void main(String[] args)
    {
        MyOwnLinkedList mine=new MyOwnLinkedList();
        mine.addFirst(10);
        mine.display();
        mine.addFirst(20);
        mine.display();
        mine.addFirst(30);
        mine.display();
        mine.addFirst(40);
        mine.display();
        mine.addLast(99);
        mine.display();
        mine.addAt(24,1);
        mine.display();
        mine.removeFirst();
        mine.display();
        mine.removeLast();
        mine.display();
        mine.removeAt(3);
        mine.display();

    }
}
