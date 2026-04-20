package ImplementationOfStacks;

public class MethodsOfImplementation
{
    public static void main(String[] args)
    {
        StackImplementationUsingLL stack=new StackImplementationUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(100);
        stack.push(-1);
        stack.display();
        System.out.println("Deleted the value at the top: "+stack.pop());

    }
}
