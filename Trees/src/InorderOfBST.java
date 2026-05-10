//Given an array of integers arr[] representing inorder traversal of elements of a binary tree. Return true if the given inorder traversal can be of a valid Binary Search
// Tree.
//If the array is:
//strictly increasing
//no duplicates
//then:
//YES → valid BST inorder
//Otherwise:
//NO
//because BST inorder must always be sorted.
class InBST{
public boolean isValidBST(int arr[]) {
    int n=arr.length;
    for(int i=1;i<n;i++){
        if(arr[i]<=arr[i-1])
            return false;
    }
    return true;
    }
}
public class InorderOfBST
{
    public static void main(String[] args) {
        int arr[]={8,14,45,64,100};
        int arr1[]={5,6,1,8,7};
        InBST in=new InBST();
        boolean res=in.isValidBST(arr);
        System.out.println(res);
        System.out.println("*******************");
        boolean res2=in.isValidBST(arr1);
        System.out.println(res2);



    }
}
