//Implement a class minHeap that supports the following operations:
//push(x) – push element x into the heap
//pop() – remove the top element from the heap
//peek() – return top element from the heap, if empty return -1
//size() - return the no of elements in the heap.
//There will be a sequence of queries queries[][]. The queries are represented in numeric form:
//1 x : call push(x)
//2: call pop()
//3: call peek()
//4: call size()
//The driver code will process the queries, call the corresponding functions, and print the outputs of peek(), size() operation.
//You only need to implement the above four functions.
import java.util.ArrayList;
import java.util.Collections;

class MinHeap
{
    ArrayList<Integer> heap;

   public MinHeap()
   {
       heap=new ArrayList<>();
   }
   public void push(int x)
   {
       heap.add(x);
       int i=heap.size()-1;
       while(i>0){
           int parent=(i-1)/2;
           if(heap.get(parent)>heap.get(i)){
               Collections.swap(heap,parent,i);
               i=parent;
           }else{
               break;
           }
       }
   }
   public void pop(){
       if(heap.isEmpty()){
           return;
       }
       heap.set(0,heap.get(heap.size()-1));
       heap.remove(heap.size()-1);

       if(!heap.isEmpty()){
           heapifyDown(0);
       }
   }

   private void heapifyDown(int i){
       while(true){
           int left=2*i+1;
           int right=2*i+2;
           int smallest=i;
           if(left<heap.size() && heap.get(left)<heap.get(smallest)){
               smallest=left;
           }
           if(right<heap.size() && heap.get(right)<heap.get(smallest)){
               smallest=right;
           }
           if(smallest==i){
               break;
           }
           Collections.swap(heap,i,smallest);
           i=smallest;
       }
   }
   public int peek(){
       if(heap.isEmpty()){
           return -1;
       }
       return heap.get(0);
   }
   public int getSize(){
       return heap.size();
   }
    public void printHeap() {
        System.out.println(heap);
    }
}
public class MinHeapImplementation
{
    public static void main(String[] args)
    {
        MinHeap h=new MinHeap();
        h.push(4);
        h.push(8);
        h.push(7);
        System.out.println("Peek: " + h.peek());

        System.out.println("Pop");
        h.pop();
        h.printHeap();

        System.out.println("Peek: " + h.peek());

        System.out.println("Size: " + h.getSize());

        System.out.println("Push 2");
        h.push(2);
        h.printHeap();

        System.out.println("Push 1");
        h.push(1);
        h.printHeap();

        System.out.println("Pop");
        h.pop();
        h.printHeap();

        System.out.println("Peek: " + h.peek());

        System.out.println("Size: " + h.getSize());
    }
}
