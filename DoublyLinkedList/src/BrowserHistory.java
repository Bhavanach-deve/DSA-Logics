class DLLNode{
    public String data;
    public DLLNode prev,next;

    DLLNode(String url){
        data=url;
        prev=null;
        next=null;
    }
}
public class BrowserHistory
{
    private DLLNode linkedListHead;
    private DLLNode current;

    public BrowserHistory(String homepage){
        linkedListHead=new DLLNode(homepage);
        current=linkedListHead;

    }
    public void visit(String url)
    {
        DLLNode newNode=new DLLNode(url);
        current.next=newNode;
        newNode.prev=current;
        current=newNode;

    }
    public String back(int step){
        while(step>0 && current.prev!=null){
            current=current.prev;
            step--;
        }
        return current.data;
    }
    public String forward(int step)
    {
        while(step>0 && current.next!=null){
            current=current.next;
            step--;
        }
        return current.data;
    }
    public void currentPage(){
        System.out.println("Current page: "+current.data);
    }

    public static void main(String[]args)
    {
        BrowserHistory bh=new BrowserHistory("leetcode");
        bh.visit("Google");
        bh.visit("youtube");
        bh.visit("github");
        bh.visit("linkedIn");
        bh.currentPage();
        System.out.println("Back: "+bh.back(1));
        System.out.println("Back: "+bh.back(1));
        System.out.println("Forward: "+bh.forward(1));
        bh.visit("greeksforgreek.com");
        System.out.println("Forward: "+bh.forward(2));
        bh.currentPage();
    }
}
