package MyQueueImp;

public class Queues
{
    public static void main(String[] args)
    {
        ImplementationOfQueueUsingLL que=new ImplementationOfQueueUsingLL();
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(40);
        que.enqueue(15);
        que.display();
        que.dequeue();
        que.display();

    }
}
