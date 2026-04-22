import java.util.Stack;

public class PreviousGreater
{
    public static int [] previousGreater(int arr[]){
        int n=arr.length;
        int[]res=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[]arr={4,5,2,25};
        int []ans=previousGreater(arr);
        for(int x: ans){
            System.out.print(x+" ");
        }

    }
}
