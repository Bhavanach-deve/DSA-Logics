//Given n elements of a stack st where the first value is the bottom-most value of the stack and the last one is the element at top of the stack, delete the middle element of the stack without using any additional data structure.
import java.util.Stack;

public class DeleteMid
{
    public static Stack<Integer>deleteMid(int n,Stack<Integer>st)
    {
        int k=n/2;
        solve(st,k);
        return st;

    }

    private static void solve(Stack<Integer> st, int k) {

        if(k==0){
            st.pop();
            return;
        }
        int temp=st.pop();
        solve(st,k-1);
        st.push(temp);

    }

    public static void main(String[] args)
    {
        Stack<Integer>ans=new Stack<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        System.out.print("Before Deletion: ");
        for(int nums:ans){
            System.out.print(nums+" ");
        }
        System.out.println();
        System.out.print("After Deletion: ");
        System.out.println(deleteMid(5,ans));

    }
}
