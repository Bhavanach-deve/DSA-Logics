import java.util.*;
public class ElementsGreaterThanRightMostElement
{
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 25};
        int res[] = nextGreaterElement(arr);
        for (int num : res) {
            System.out.print(num+" ");
        }
    }
    private static int[]nextGreaterElement(int arr[]){
        int n=arr.length;
        int []output=new int[n];

        Stack<Integer>st=new Stack<>();

        st.push(0);// stores the indexs

        for(int i=1;i<n;i++){

            while(!st.empty()&&arr[i]>arr[st.peek()])//index at top of the stack
            {
                output[st.peek()]=arr[i];
                st.pop();

            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int topIndex=st.peek();
            output[topIndex]=-1;
            st.pop();
        }
        return output;
    }
}
